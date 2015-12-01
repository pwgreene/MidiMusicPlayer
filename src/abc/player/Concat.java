package abc.player;

import abc.sound.SequencePlayer;

/**
 * The joining of two pieces of music to be played one after another
 *
 */
public class Concat implements Music {

    //Abstraction Function:
    //TODO
    //Rep Invariant:
    //TODO
    //Safety from Rep Exposure:
    //TODO
    
    private final Music m1;
    private final Music m2;
    
    /**
     * Create a new Concat object that joins two pieces of music together
     * @param m1 the first piece to be played
     * @param m2 the second piece to be played
     */
    public Concat(Music m1, Music m2) {
        this.m1 = m1;
        this.m2 = m2;
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
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void play(SequencePlayer seqPlayer, int atBeat) {
        // TODO Auto-generated method stub
        
    }

}
