package abc.player;

import abc.sound.Pitch;
import abc.sound.SequencePlayer;

/**
 * A single note to be played by an instrument
 *
 */
public class SingleNote implements Music{

  //Abstraction Function:
    //represents a note of music with a pitch pitch and that lasts for duration ticks
    //Rep Invariant:
     //duration > 0
    //Safety from Rep Exposure:
     //all fields are private and final
     //class is immutable: no mutators, no mutation of the field duration or pitch
    
    private final int duration;
    private final Pitch pitch;
    //private int accidental;
    
    /**
     * Create a new instance of a SingleNote
     * @param duration the duration to play this note in ticks. Must be positive.
     * @param pitch the pitch at which to play this note
     * @param accidental the number of semitones up or down to play this note. 1 is sharp, 0 is natural, -1 is flat.
     * Must be -2(double flat), -1, 0, 1, or 2 (double sharp)
     */

    public SingleNote(int duration, Pitch pitch, int accidental) {
        this.duration = duration;
        this.pitch = pitch.transpose(accidental);
        checkRep();
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
    
    private void checkRep() {
        assert duration > 0;
    }
    
    
}
