package abc.player;

import java.util.Collections;
import java.util.List;

import abc.sound.SequencePlayer;

/**
 * Multiple notes played at the same time. Immutable.
 */

public class Chord implements Music{

    //Abstraction Function:
    //Represents a chord of music, where each note in notes is played simultaneously
    //Rep Invariant:
    //notes.size() > 1
    //Safety from Rep Exposure:
    //notes is private and final and is never mutated
    //getNotes returns unmodfiable list of notes
    //Class is immutable

    private final List<SingleNote> notes;

    /**
     * Create a new Chord object that joins two or more different musics
     * @param notes a list of SingleNotes that compose the chord
     */
    public Chord(List<SingleNote> notes) {
        this.notes = notes;
        checkRep();
    }
    
    /**
     * Ensures that there' more than one note in the chord (as all chords should)
     */
    public void checkRep(){
        assert notes.size()>1;
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
    public RationalNum getDuration() {
        RationalNum maxDuration = new RationalNum(0, 1);
        for (SingleNote note: notes) {
            if(note.getDuration().compareTo(maxDuration) > 0){
                maxDuration = note.getDuration(); 
            }
        }
        return maxDuration;
    }


    @Override
    public void play(SequencePlayer seqPlayer, int atTick, int atSpeed) {
        for(SingleNote note: notes){
            note.play(seqPlayer, atTick, atSpeed);
        }
    }

    @Override
    public boolean isResting() {
        return false;
    }
    
    @Override
    /**
     * Two chords are equal if they contain the same SingleNotes
     */
    public boolean equals(Object other) {
        if(!(other instanceof Chord))
            return false;
        Chord chord = (Chord)other;
        if(chord.getNotes().size() != this.getNotes().size()){
            return false;
        }
        for (SingleNote aNote: chord.getNotes()) {
            if(!this.getNotes().contains(aNote)){
                return false;
            }
        }
        return true;
    }
    
    /**
     * @return a unmodifiable list of the notes in the chord
     */
    public List<SingleNote> getNotes(){
        return Collections.unmodifiableList(this.notes);
    }
    
    @Override
    public int hashCode(){
        return notes.size();
    }
}
