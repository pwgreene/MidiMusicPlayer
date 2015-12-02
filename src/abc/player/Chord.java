package abc.player;

import java.util.ArrayList;

import abc.sound.SequencePlayer;

//Chord is a list of multiple single notes to be played at the same time

public class Chord implements Music{
    
    //Abstraction Function:
    //TODO
    //Rep Invariant:
    //TODO
    //Safety from Rep Exposure:
    //TODO
    
    private final ArrayList<SingleNote> notes;
    
    /**
     * Create a new Chord object that joins two or more different musics
     * @param m1 the first voice to be played
     * @param m2 the second voice to be played
     */
    public Chord(ArrayList<SingleNote> notes) {
        this.notes = notes;
    }
    
    @Override
    public Music transpose(int semitonesUp) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Music inKey(Key key) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public String toString() {
        // TODO implement this
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
