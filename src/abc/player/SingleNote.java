package abc.player;

import abc.sound.Pitch;

/**
 * A single note to be played by an instrument
 *
 */
public class SingleNote implements Music{

  //Abstraction Function:
    //TODO
    //Rep Invariant:
    //TODO
    //Safety from Rep Exposure:
    //TODO
    
    private final double duration;
    private final Pitch pitch;
    private final char accidental;
    
    /**
     * Create a new instance of a SingleNote
     * @param duration the duration to play this note in beats
     * @param pitch the pitch at which to play this note
     * @param accidental a character representing the accidental for the note.
     * Must be sharp: '^', flat: '_', or natural: '='
     */
    public SingleNote(double duration, Pitch pitch, char accidental) {
        this.duration = duration;
        this.pitch = pitch;
        this.accidental = accidental;
    }
    
    @Override
    public Music transpose(int semitonesUp) {
        // TODO implement this
        return null;
    }

    @Override
    public Music inKey(Key key) {
        // TODO implement this
        return null;
    }

}
