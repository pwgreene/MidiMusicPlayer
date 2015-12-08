package abc.player;

import java.util.List;

import abc.sound.SequencePlayer;

/**
 * Multiple notes played at the same time. Immutable.
 *
 */

public class Chord implements Music{
    
    //Abstraction Function:
     //Represents a chord of music, where each note in notes is played simultaneously
    //Rep Invariant:
     //notes.size() > 0
    //Safety from Rep Exposure:
     //notes is private and final and is never mutated
     //Class is immutable
    
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
