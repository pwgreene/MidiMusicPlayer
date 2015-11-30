package abc.player;

import java.io.File;

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
     */
    public void play(int atTick);
    
    /**
     * Transpose this music piece by a given number of semitones
     * @param semitonesUp an integer representing the number of semitones by which to transpose
     * this piece of music. A positive number shifts it up, a negative number shifts it down
     * @return a new piece of music transposed by semitonesUp semitones.
     */
    public Music transpose(int semitonesUp);
    
    /**
     * Changes all notes in the piece to the specified key
     * @param key the key to play this piece in
     * @return a new piece of music transposed into the specified key
     */
    public Music inKey(Key key);
    
    @Override
    public String toString();
    
    /**
     * Gets the length (duration) of this music piece in ticks
     * @return the length of this music piece in ticks
     */
    public int getDuration();
}

enum Key {
    C_MAJOR, G_MAJOR, D_MAJOR, A_MAJOR, E_MAJOR, B_MAJOR, Fsharp_MAJOR, Csharp_MAJOR,
    A_MINOR, E_MINOR, B_MINOR, Fsharp_MINOR, Csharp_MINOR, Gsharp_MINOR, Dsharp_MINOR, Asharp_MINOR
}
