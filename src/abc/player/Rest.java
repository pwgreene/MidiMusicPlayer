package abc.player;

import abc.sound.SequencePlayer;

/**
 * Represents a rest in the music that extends for a period of time
 * @author Parker
 *
 */
public class Rest implements Music {

    //Abstraction Function:
    //TODO
    //Rep Invariant:
    //TODO
    //Safety from Rep Exposure:
    //TODO
    
    private final int duration;
    
    /**
     * Create a new Rest 
     * @param duration the length for which to rest in ticks, must be nonnegative
     */
    public Rest(int duration) {
        this.duration = duration;
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
    public int getDuration() {
        return duration;
    }

    @Override
    public void play(SequencePlayer seqPlayer, int atBeat) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString() {
        if (duration == 0) {
            return "";
        }
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
}
