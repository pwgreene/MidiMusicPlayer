package abc.player;

import java.io.File;

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
     */
    public static Music parse(File musicFile) {
        //TODO implement this
        return null;
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
}

