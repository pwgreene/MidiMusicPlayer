package abc.player;

import abc.sound.SequencePlayer;

// The joining of two pieces of music to be played at the same time

public class Layer implements Music {
    //Abstraction Function:
     //Represents two voices of music that are played on top of one another, starting at the same time
    //Rep Invariant:
     //true
    //Safety from Rep Exposure:
     //all fields are private and final
     //class is immutable: no mutator methods, m1 and m2 are immutable types
    
    private final Music m1;
    private final Music m2;
    
    /**
     * Create a new Layer object that joins two voice together
     * @param m1 the first voice to be played
     * @param m2 the second voice to be played
     */
    public Layer(Music m1, Music m2) {
        //TODO: what about the case where its m1 or m2 is also a Layer? How would you do voiceNames?
        this.m1 = m1;
        this.m2 = m2;
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
        return m1.toString()+"\n"+m2.toString();
    }

    @Override
    public void play(SequencePlayer seqPlayer, int atTick) {
        m1.play(seqPlayer, atTick);
        m2.play(seqPlayer, atTick);
    }

    @Override
    public boolean isResting() {
        return m1.isResting() && m2.isResting();
    }
}
