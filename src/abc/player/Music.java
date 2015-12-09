package abc.player;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import abc.parser.AbcLexer;
import abc.parser.AbcParser;
import abc.parser.MakeMusic;
import abc.sound.SequencePlayer;

/**
 * An immutable piece of music played by one or more instruments
 */
public interface Music {
    
    //Data Type Definition:
    //Music = SingleNote(duration:double, pitch:Pitch) + Rest(double:duration) 
    //        Tuplet(notes:List<SingleNotes>) + Chord(notes:List<SingleNote>)
    
    
    /**
     * Parse an abc file. The file must be in abc format as specified by the project handout.
     * @param musicFile an abc music file
     * @return a new SequencePlayer object with the correct music added to it
     * @throws IOException 
     * @throws InvalidMidiDataException 
     * @throws MidiUnavailableException 
     */
    public static SequencePlayer parse(File musicFile) throws IOException, MidiUnavailableException, InvalidMidiDataException {
        try {
            List<String> allLines = Files.readAllLines(musicFile.toPath());
            String input = "";
            for (String line : allLines) {
                input += line + "\n";
            }
            CharStream stream = new ANTLRInputStream(input);
            AbcLexer lexer = new AbcLexer(stream);
            lexer.reportErrorsAsExceptions(); //throws error if one is found

            TokenStream tokens = new CommonTokenStream(lexer);
            AbcParser parser = new AbcParser(tokens);
            parser.reportErrorsAsExceptions();
            ParseTree tree;
            tree = parser.root();  
            //Trees.inspect(tree, parser);

            //after tree is made, now walk tree and return the Music
            MakeMusic musicMaker = new MakeMusic();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(musicMaker, tree);
            //System.out.println(musicMaker.getBPM() + " " + musicMaker.getComposer() + musicMaker.getComposer());
            
            int beatsPerMinute = musicMaker.getBPM();
            int speed = musicMaker.getDefaultLength().getDenom(); //* musicMaker.getTempoBeat().getDenom();
            HashMap<String, List<List<Music>>> music = musicMaker.getMusic(); 
            Set<String> voices = music.keySet();
            //iterate and find the desired speed, based on the denominators of all the durations
            for (String voice : voices) {
                for (List<Music> measure : music.get(voice)) {
                    for (Music note : measure) {
                        speed = RationalNum.LCM(speed, note.getDuration().getDenom());
                    }
                }
            }
            int multiplier = musicMaker.getDefaultLength().getDenom() / musicMaker.getTempoBeat().getDenom();
            SequencePlayer player = new SequencePlayer(beatsPerMinute*speed*multiplier, 1);
            //now play each note at the correct speed
            for (String voice : voices) {
                int currentTick = 0;
                for (List<Music> measure : music.get(voice)) {
                    for (Music note : measure) {
                        note.play(player, currentTick, speed);
                        currentTick += speed*note.getDuration().getRationalNumber();
                    }
                }
            }
            return player;
        } 
        catch (RuntimeException e) {
            e.printStackTrace(System.out);
            throw new IllegalArgumentException("Invalid Input");
        }  
    }
    
    /**
     * Play this piece of music
     * @param atTick the beat at which to begin playing the music
     * @param seqPlayer the sequence player that will actually play the music
     * @param atSpeed makes the song that many times slower. Must be positive.
     */
    public void play(SequencePlayer seqPlayer, int atTick, int atSpeed);
    
    /**
     * Gets the length (duration) of this music piece in ticks
     * @return the length of this music piece in ticks
     */
    public RationalNum getDuration();
    
    /**
     * Check to see if this piece of music is going to play
     * @return true if this piece of music isn't playing anything, false if it is.
     */
    public boolean isResting();
    
}

