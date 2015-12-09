package abc.player;

import java.util.ArrayList;
import java.util.List;

import abc.sound.SequencePlayer;

public class Tuplet implements Music {

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
     * @return the type of this tuplet
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type of this tuplet (duplet, triplet, quadruplet)
     * @param notes the notes that constitute this tuplet
     */
    public Tuplet(int type, List<Music> notes) {
        this.type = type;
        this.notes = new ArrayList<Music>(notes);
    }

    /**
     * @return a string representation of this tuplet
     */
    @Override
    public String toString() {
        String tupletString = "("+this.getType();
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

    /**
     * @return Computes the duration of the tuplet based on its type and its constituents
     */
    public RationalNum getDuration() {
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
    public int getDuration() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isResting() {
        // TODO Auto-generated method stub
        return false;
    }
}
