package abc.player;

/**
 * A piece of music played by one or more instruments
 *
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
     * Play this piece of music
     */
    public void play();
    
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
}

enum Key {
    C_MAJOR, G_MAJOR, D_MAJOR, A_MAJOR, E_MAJOR, B_MAJOR, Fsharp_MAJOR, Csharp_MAJOR,
    A_MINOR, E_MINOR, B_MINOR, Fsharp_MINOR, Csharp_MINOR, Gsharp_MINOR, Dsharp_MINOR, Asharp_MINOR
}
