package abc.player;

import java.util.ArrayList;
import java.util.List;

import abc.sound.SequencePlayer;

public class Tuplet implements Music {
    
    //Abstraction Function
     //type is an integer, either 2, 3, or 4. 2 -> tuplet, 3 -> triplet, 4 -> quadruplet
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
     * @return the notes that constitute this tuplet (IMPORTANT: the "notes" can include Chords)
     */
    public List<Music> getNotes() {
        return notes;
    }

    /**
     * @param notes the notes that constitute this tuplet. Must be of size 2, 3, or 4.
     */
    public Tuplet(List<Music> notes) {
        this.type = notes.size();
        this.notes = new ArrayList<Music>(notes);
        checkRep();
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
    
    private void checkRep() {
        assert notes.size() == 2 || notes.size() == 3 || notes.size() == 4;
        assert type == 2 || type == 3 || type == 4;
    }

    /**
     * @return Computes the duration of the tuplet based on its type and its constituents
     */
    public RationalNum getDuration() {
        /*if (type == 2) {
            return 3;
        } else if (type == 3) {
            return 2;
        } else {
            return 3;
        }*/
        int durationNum = 0;
        int durationDen = 1;
        for(Music n : notes) {
            int noteNum = n.getDuration().getNum();
            int noteDen = n.getDuration().getDenom();
            durationNum = noteNum*durationDen + durationNum*noteDen;
            durationDen = noteDen * durationDen;
        }
        int gcd = RationalNum.GCD(durationNum, durationDen);
        durationNum /= gcd;
        durationDen /= gcd;
        switch(type) {
        case 2:
            durationNum *= 3;
            durationDen *= 2;
            break;
        case 3:
            durationNum *= 2;
            durationDen *= 3;
            break;
        case 4:
            durationNum *= 3;
            durationDen *= 4;
            break;
        }
        return new RationalNum(durationNum, durationDen);
    }

    @Override
    public void play(SequencePlayer seqPlayer, int atTick) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isResting() {
        return false;
    }
}
