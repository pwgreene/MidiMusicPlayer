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
    
    private final int duration;
    private final Pitch pitch;
    
    /**
     * Create a new instance of a SingleNote
     * @param duration the duration to play this note in beats
     * @param pitch the pitch at which to play this note
     * Must be sharp: '^', flat: '_', or natural: '='
     */
    public SingleNote(int duration, Pitch pitch) {
        this.duration = duration;
        this.pitch = pitch;
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

    
    @Override
    public String toString() {
        //TODO
        return "";
    }

    @Override
    public void play(int atTick) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getDuration() {
        return duration;
    }

}
