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
     * @param duration the length for which to rest in ticks
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
    public String toString() {
        //TODO implement this
        return "";
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void play(SequencePlayer seqPlayer, int atBeat) {
        // TODO Auto-generated method stub
        
    }
    
}
