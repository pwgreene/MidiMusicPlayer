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
    
    /**
     * Create a new instance of a SingleNote
     * @param duration the duration to play this note in ticks. Must be positive.
     * @param pitch the pitch at which to play this note
     * Must be sharp: '^', flat: '_', or natural: '='
     */

    public SingleNote(int duration, Pitch pitch) {
        this.duration = duration;
        this.pitch = pitch;
    }
    
    
    @Override
    public String toString() {
        return this.getPitch().toString()+duration;
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


    @Override
    public boolean isResting() {
        return false;
    }
    
    
}
