package abc.player;

import abc.sound.SequencePlayer;

/**
 * Represents a rest in the music that extends for a period of time
 * @author Parker
 *
 */
public class Rest implements Music {

    //Abstraction Function:
     //represents a rest in music, played for duration ticks
    //Rep Invariant:
     //duration > 0
    //Safety from Rep Exposure:
     //duration is private and final
     //no mutator methods/duration is immutable -> class is immutable
    
    private final int duration;
    
    /**
     * Create a new Rest 
     * @param duration the length for which to rest in ticks, must be nonnegative
     */
    public Rest(int duration) {
        this.duration = duration;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void play(SequencePlayer seqPlayer, int atTick) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString() {
        return "z"+duration;
    }
    @Override
    public boolean equals(Object thatObject) {
        if ( ! (thatObject instanceof Rest)) { return false; }
        Rest that = (Rest)thatObject;
        
        return this.duration == that.getDuration();
    }
    @Override
    public int hashCode() {
        return this.duration;
    }

    @Override
    public boolean isResting() {
        return true;
    }
}
