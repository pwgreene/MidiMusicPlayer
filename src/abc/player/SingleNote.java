package abc.player;

import abc.sound.Pitch;
import abc.sound.SequencePlayer;

/**
 * A single note to be played by an instrument
 */
public class SingleNote implements Music{

  //Abstraction Function:
    //represents a note of music with a pitch pitch and that lasts for duration ticks
    //Rep Invariant:
     //duration > 0
    //Safety from Rep Exposure:
     //all fields are private and final
     //class is immutable: no mutators, no mutation of the field duration or pitch
    
    private final RationalNum duration;
    private final Pitch pitch;
    
    /**
     * Create a new instance of a SingleNote
     * @param duration the duration to play this note in ticks. Must be positive.
     * @param pitch the pitch at which to play this note
     */

    public SingleNote(RationalNum duration, Pitch pitch) {
        this.duration = duration;
        this.pitch = pitch;
        checkRep();
    }
    
    
    @Override
    public String toString() {
        return this.getPitch().toString()+duration;
    }
    
    @Override
    public void play(SequencePlayer seqPlayer, int atTick, int atSpeed) {
        //scales the duration to the correct speed.
        int duration = Math.round(atSpeed * getDuration().getNum()/getDuration().getDenom());
        seqPlayer.addNote(this.getPitch().toMidiNote(), atTick, duration);   
    }
    
    @Override
    public RationalNum getDuration() {
        return duration;
    }
    
    /**
     * Get the pitch of this note
     * @return the pitch of this note
     */
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
        return this.duration.hashCode();
    }


    @Override
    public boolean isResting() {
        return false;
    }
    
    private void checkRep() {
        assert getDuration().getNum() > 0;
        assert getDuration().getDenom() > 0;
    }
    
    
}
