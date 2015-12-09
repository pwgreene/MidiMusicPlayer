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
    
    private final RationalNum duration;
    
    /**
     * Create a new Rest 
     * @param duration the length for which to rest in ticks, must be nonnegative
     */
    public Rest(RationalNum duration) {
        this.duration = duration;
        checkRep();
    }

    @Override
    public RationalNum getDuration() {
        return duration;
    }

    @Override
    public void play(SequencePlayer seqPlayer, int atTick, int atSpeed) {
        //do nothing
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
        return this.duration.getNum();
    }

    @Override
    public boolean isResting() {
        return true;
    }
    
    private void checkRep() {
        assert getDuration().getNum() > 0;
        assert getDuration().getDenom() > 0;
    }
}
