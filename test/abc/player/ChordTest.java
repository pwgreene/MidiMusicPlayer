package abc.player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import abc.sound.Pitch;

//This class tests the Chord class in abc.player.

public class ChordTest {
   /*Testing Strategy*/
    
    //Constructor:
    //# of notes: 2, >2
    //pitches of notes, combinations of:
    //low octave, middle octave, high octave
    //a,b,c,d,e,f,g (not necessary to test ALL)
    
    //toString():
    //# of notes: 2, >2
    //duration of notes is same/different
    //pitches of notes, combinations of:
    //low octave, middle octave, high octave
    //a,b,c,d,e,f,g (not necessary to test ALL)
    
    /*
     * combine constructor and toString() tests:
     */

    @Test //test 2 notes, both low octave: A and B
    public void testChordTwoLowOctaveNotes() {
        SingleNote noteA = new SingleNote(1, new Pitch('A').transpose(-8));
        SingleNote noteB = new SingleNote(1, new Pitch('B').transpose(-8));
        List<SingleNote> notes = Arrays.asList(noteA, noteB);
        Music chord = new Chord(notes);
        assertEquals("[^A1^B1]", chord.toString());
    }
    @Test //test 2 notes, both middle octave: B and C
    public void testChordTwoMiddleOctaveNotes() {
        SingleNote noteA = new SingleNote(1, new Pitch('B'));
        SingleNote noteB = new SingleNote(1, new Pitch('C'));
        List<SingleNote> notes = Arrays.asList(noteA, noteB);
        Music chord = new Chord(notes);
        assertEquals("[B1C1]", chord.toString());
    }
    @Test //test 2 notes, both high octave: D and E
    public void testChordTwoHighOctaveNotes() {
        
    }
    @Test //test >2 notes, one of each octave: A, F, G
    public void testChordMoreThanTwoNotes() {
        
    }
    @Test //test >2 notes, all different lengths: B, B, E
    public void testChordMultipleNotesDifferentLengths() {
        
    }
    //getDuration():
    //Notes of the same/different durations 
    //(including all partitions included in Constructor partition
    
    
}
