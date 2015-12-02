package abc.player;

import abc.sound.Pitch;
import abc.sound.SequencePlayer;

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
    private final Key key;
    
    /**
     * Create a new instance of a SingleNote
     * @param duration the duration to play this note in beats
     * @param pitch the pitch at which to play this note
     * @param key the key in which this note is written
     * Must be sharp: '^', flat: '_', or natural: '='
     */

    public SingleNote(int duration, Pitch pitch, Key key) {
        this.duration = duration;
        this.pitch = pitch;
        this.key = key;
    }
    
    
    @Override
    public String toString() {
        return this.getPitch().toString();
    }
    
    @Override
    public void play(SequencePlayer seqPlayer, int atTick) {
        seqPlayer.addNote(this.getPitch().toMidiNote(), atTick, this.getDuration());   
    }
    
    public int getDuration() {
        return duration;
    }

    public Pitch getPitch(){
        return this.pitch;
    }
    
    @Override
    public boolean equals(Object thatObject) {
        if ( ! (thatObject instanceof SingleNote)) { return false; }
        SingleNote that = (SingleNote)thatObject;
        
        return this.duration == that.getDuration() && this.pitch.equals(that.getPitch());
    }
    @Override
    public int hashCode() {
        return this.duration;
    }
    
    
}
