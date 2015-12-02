package abc.player;

import abc.sound.SequencePlayer;

// The joining of two pieces of music to be played at the same time

public class Layer implements Music {
    //Abstraction Function:
    //TODO
    //Rep Invariant:
    //TODO
    //Safety from Rep Exposure:
    //TODO
    
    private final Music m1;
    private final Music m2;
    private final String v1Name;
    private final String v2Name;
    
    /**
     * Create a new Layer object that joins two voice together
     * @param m1 the first voice to be played
     * @param m2 the second voice to be played
     */
    public Layer(Music m1, Music m2, String voiceName1, String voiceName2) {
        this.m1 = m1;
        this.m2 = m2;
        this.v1Name = voiceName1;
        this.v2Name = voiceName2;
    }
    
    @Override
    //Returns the maximum duration of the two musics
    public int getDuration() {
        if(m1.getDuration()>m2.getDuration()){
            return m1.getDuration();
        }
        return m2.getDuration();
    }
 
    @Override
    public String toString() {
        return v1Name+": "+m1.toString()+"\n"+v2Name+": "+m2.toString();
    }

    @Override
    public void play(SequencePlayer seqPlayer, int atTick) {
        m1.play(seqPlayer, atTick);
        m2.play(seqPlayer, atTick);
    }
}
