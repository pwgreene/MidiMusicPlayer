package abc.player;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;

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
     * @return the file parsed into a Music object that can then be played.
     * @throws IOException 
     */
    public static MusicAndBeat parse(File musicFile) throws IOException {
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
            Trees.inspect(tree, parser);

            //after tree is made, now walk tree and return the Music
            MakeMusic musicMaker = new MakeMusic();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(musicMaker, tree);
            System.out.println(musicMaker.getBPM() + " " + musicMaker.getComposer() + musicMaker.getComposer());
            int beatsPerMinute = musicMaker.getBPM();
            HashMap<String,List<List<Music>>> music = musicMaker.getMusic(); 
            return new MusicAndBeat(music, beatsPerMinute);
        } 
        catch (RuntimeException e) {
            throw new IllegalArgumentException("Invalid Input");
        }  
    }
    
    /**
     * Play this piece of music
     * @param atTick the beat at which to begin playing the music
     * @param seqPlayer the sequence player that will actually play the music
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
/**
 * A pairing of Music and an integer, where the integer is the Beats Per Minute of the 
 * Music piece
 *
 */
class MusicAndBeat {
    
    //Abstraction Function:
     //music represents a piece of music and beatsPerMinute is an integer representing 
     //how many beats per minute the music is supposed to be played in
    //Rep Invariant:
     //beatsPerMinute > 0
    //Safety from Rep Exposure:
     //Music is an immutable type, so returning a ref to music field is safe, int is also immutable
     //all fields are private and final
    
    private final HashMap<String,List<List<Music>>> music;
    private final int beatsPerMinute;
    
    public MusicAndBeat(HashMap<String,List<List<Music>>> music, int beatsPerMinute) {
        this.music = music ;
        this.beatsPerMinute = beatsPerMinute;
    }
    
    public HashMap<String,List<List<Music>>> getMusic() {
        return music;
    }
    
    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }
}

