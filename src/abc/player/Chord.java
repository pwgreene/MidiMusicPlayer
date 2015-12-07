package abc.player;

import java.util.List;

import abc.sound.SequencePlayer;

//Chord is a list of multiple single notes to be played at the same time

public class Chord implements Music{
    
    //Abstraction Function:
    //TODO
    //Rep Invariant:
    //TODO
    //Safety from Rep Exposure:
    //TODO
    
    private final List<SingleNote> notes;
    
    /**
     * Create a new Chord object that joins two or more different musics
     * @param m1 the first voice to be played
     * @param m2 the second voice to be played
     */
    public Chord(List<SingleNote> notes) {
        this.notes = notes;
    }
    
    @Override
    public String toString() {
        String chord = "[";
        for(SingleNote note: notes){
            chord = chord + note.toString();
        }
        chord += "]";
        return chord;
    }

    @Override
    public int getDuration() {
        int maxDuration = 0;
        for(SingleNote note: notes){
            if(note.getDuration() > maxDuration){
                maxDuration = note.getDuration(); 
            }
        }
        return maxDuration;
    }

    
    @Override
    public void play(SequencePlayer seqPlayer, int atTick) {
        for(SingleNote note: notes){
            note.play(seqPlayer, atTick);
        }
    }

    @Override
    public boolean isResting() {
        return false;
    }
}
