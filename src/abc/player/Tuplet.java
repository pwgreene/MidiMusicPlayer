package abc.player;

import java.util.ArrayList;
import java.util.List;

import abc.sound.SequencePlayer;

/*
 * A tuplet of 2,3, or 4 notes played consecutively 
 */

public class Tuplet implements Music {

    //Abstraction Function
    //type is an integer, either 2, 3, or 4. 2 -> duplet, 3 -> triplet, 4 -> quadruplet
    //each note notes is a note in the tuplet, in order.
    //Rep invariant:
    //type must be 2, 3, or 4
    //notes is length 2, 3, or 4
    //Safety from Rep Exposure:
    //all fields are private and final
    //class is immutable, no mutators, notes is never mutated and its elements are the immutable Music type

    //The type of the tuplet - either a duplet (2), triplet (3), or quadruplet (4) 
    private final int type;
    //The notes that constitute this tuplet     
    private final List<Music> notes;
  
    /**
     * @param notes the notes that constitute this tuplet. Must be of size 2, 3, or 4.
     */
    public Tuplet(List<Music> notes) {
        this.type = notes.size();
        this.notes = new ArrayList<Music>(notes);
        checkRep();
    }

    /**
     * @return the notes that constitute this tuplet 
     */
    public List<Music> getNotes() {
        return notes;
    }
    
    /**
     * @return a string representation of this tuplet
     */
    @Override
    public String toString() {
        String tupletString = "("+this.type;
        for(Music n : notes) {
            tupletString = tupletString + n.toString();
        }
        return tupletString;
    }

    @Override
    /**
     * Two tuples are equal if they contain the same notes in the same order
     */
    public boolean equals(Object other) {
        if(!(other instanceof Tuplet))
            return false;
        Tuplet Tuplet = (Tuplet)other;
        for (int i = 0; i < Tuplet.notes.size(); i ++) {
            if (!(Tuplet.notes.get(i).equals(this.notes.get(i))))
                return false;
        }
        return true;
    }

    /**
     * Checks that type must be 2,3, or 4, and notes.size() must be 2, 3, or 4
     */
    private void checkRep() {
        assert notes.size() == 2 || notes.size() == 3 || notes.size() == 4;
        assert type == 2 || type == 3 || type == 4;
    }

    /**
     * @return Computes the duration of the tuplet based on its type and its constituents
     */
    public RationalNum getDuration() {
        if (type == 2) {
            return new RationalNum(6, 2);
        } else if (type == 3) {
            return new RationalNum(6, 3);
        } else {
            return new RationalNum(12, 4);
        }
    }
    
    

    @Override
    public void play(SequencePlayer seqPlayer, int atTick, int atSpeed) {
        int currentTick = atTick;
        for (Music note : notes) {
            note.play(seqPlayer, currentTick, atSpeed);
            currentTick += atSpeed*note.getDuration().getRationalNumber();
        }
    }

    @Override
    public boolean isResting() {
        return false;
    }
    
    /**
     * @return the type either 2->duplet, 3->triplet, or 4->quadruplet
     */
    public int getType(){
        return this.type;
    }
    
    @Override
    public int hashCode(){
        return this.getType();
    }
}
