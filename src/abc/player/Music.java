package abc.player;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

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
 * A piece of music played by one or more instruments
 */
public interface Music {
    
    //Recursive Data Type Definition:
    //Music = SingleNote(duration:double, pitch:Pitch) + Rest(double:duration) 
    //        + Concat(m1:Music, m2: Music) + Layer(m1:Music, m2: Music) + Chord(notes:ArrayList<SingleNote>)
    
    //Abstraction Function:
    //TODO
    //Rep Invariant:
    //TODO
    //Safety from Rep Exposure:
    //TODO
    
    
    /**
     * Parse an abc file. The file must be in abc format as specified by the project handout.
     * @param musicFile an abc music file
     * @return the file parsed into a Music object that can then be played.
     * @throws IOException 
     */
    public static Music parse(File musicFile) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(musicFile));
            StringBuilder input = new StringBuilder();
            try {
                String line = reader.readLine();

                while (line != null) {
                    input.append(line);
                    input.append(System.lineSeparator());
                    line = reader.readLine();
                }
            } finally {
                reader.close();
            }
            String allLines = input.toString();
            CharStream stream = new ANTLRInputStream(allLines);
            AbcLexer lexer = new AbcLexer(stream);
            lexer.reportErrorsAsExceptions(); //throws error if one is found

            TokenStream tokens = new CommonTokenStream(lexer);
            AbcParser parser = new AbcParser(tokens);
            parser.reportErrorsAsExceptions();
            ParseTree tree;
            tree = parser.root();  

            //after tree is made, now walk tree and return the Music
            MakeMusic musicMaker = new MakeMusic();
            new ParseTreeWalker().walk(musicMaker, tree);
            return musicMaker.getMusic(); 
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
    public void play(SequencePlayer seqPlayer, int atTick);
    
    /**
     * Gets the length (duration) of this music piece in ticks
     * @return the length of this music piece in ticks
     */
    public int getDuration();
    
    /**
     * Check to see if this piece of music is going to play
     * @return true if this piece of music isn't playing anything, false if it is.
     */
    public boolean isResting();
    
}

