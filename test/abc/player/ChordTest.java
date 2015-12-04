package abc.player;

import static org.junit.Assert.*;

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
    //note(s) is/are sharp, natural, flat
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
        SingleNote noteA = new SingleNote(1, new Pitch('A').transpose(-12));
        SingleNote noteB = new SingleNote(1, new Pitch('B').transpose(-12));
        List<SingleNote> notes = Arrays.asList(noteA, noteB);
        Music chord = new Chord(notes);
        assertEquals("[A,1B,1]", chord.toString());
    }
    @Test //test 2 notes, both middle octave: B and C
    public void testChordTwoMiddleOctaveNotes() {
        SingleNote noteB = new SingleNote(1, new Pitch('B'));
        SingleNote noteC = new SingleNote(1, new Pitch('C'));
        List<SingleNote> notes = Arrays.asList(noteB, noteC);
        Music chord = new Chord(notes);
        assertEquals("[B1C1]", chord.toString());
    }
    @Test //test 2 notes, both high octave: D and E
    public void testChordTwoHighOctaveNotes() {
        SingleNote noteD = new SingleNote(1, new Pitch('D').transpose(12));
        SingleNote noteE = new SingleNote(1, new Pitch('E').transpose(12));
        List<SingleNote> notes = Arrays.asList(noteD, noteE);
        Music chord = new Chord(notes);
        assertEquals("[D'1E'1]", chord.toString());
    }
    @Test //test >2 notes, one of each octave: A, Fsharp, G
    public void testChordMoreThanTwoNotes() {
        SingleNote noteA = new SingleNote(1, new Pitch('A').transpose(-12));
        SingleNote noteF = new SingleNote(1, new Pitch('F').transpose(1));
        SingleNote noteG = new SingleNote(1, new Pitch('G').transpose(12));
        List<SingleNote> notes = Arrays.asList(noteA, noteF, noteG);
        Music chord = new Chord(notes);
        assertEquals("[A,1^F1G'1]", chord.toString());
    }
    @Test //test >2 notes, all different lengths: B, Bflat, E, durations >1
    public void testChordMultipleNotesDifferentLengths() {
        SingleNote noteB = new SingleNote(4, new Pitch('B'));
        SingleNote noteBflat = new SingleNote(5, new Pitch('B').transpose(-1)); //Bflat=Asharp
        SingleNote noteE = new SingleNote(10, new Pitch('E'));
        List<SingleNote> notes = Arrays.asList(noteB, noteBflat, noteE);
        Music chord = new Chord(notes);
        assertEquals("[B4^A5E10]", chord.toString());
    }
    
    //getDuration():
    //Notes of the same/different durations 
    //(including all partitions included in Constructor partition
    @Test //two notes, same length
    public void testGetDurationAllSameLengthTwoNotes() {
        SingleNote noteA = new SingleNote(3, new Pitch('A').transpose(12));
        SingleNote noteB = new SingleNote(3, new Pitch('B'));
        List<SingleNote> notes = Arrays.asList(noteA, noteB);
        Music chord = new Chord(notes);
        assertEquals(3, chord.getDuration());
    }
    @Test //three notes, same length
    public void testGetDurationAllSameLengthThreeNotes() {
        SingleNote noteA = new SingleNote(3, new Pitch('A').transpose(12));
        SingleNote noteB = new SingleNote(3, new Pitch('B'));
        SingleNote noteG = new SingleNote(3, new Pitch('G'));
        List<SingleNote> notes = Arrays.asList(noteA, noteB, noteG);
        Music chord = new Chord(notes);
        assertEquals(3, chord.getDuration());
    }
    @Test //two notes, different length
    public void testGetDurationDifferentLengthTwoNotes() {
        SingleNote noteA = new SingleNote(3, new Pitch('A').transpose(12));
        SingleNote noteB = new SingleNote(5, new Pitch('B'));
        List<SingleNote> notes = Arrays.asList(noteA, noteB);
        Music chord = new Chord(notes);
        //should be the longer of the two
        assertEquals(5, chord.getDuration());
    }
    @Test //three notes, different length
    public void testGetDurationDifferentLengthThreeNotes() {
        SingleNote noteA = new SingleNote(3, new Pitch('A').transpose(12));
        SingleNote noteC = new SingleNote(8, new Pitch('C'));
        SingleNote noteG = new SingleNote(12, new Pitch('G'));
        List<SingleNote> notes = Arrays.asList(noteA, noteC, noteG);
        Music chord = new Chord(notes);
        assertEquals(12, chord.getDuration());
    }
    
}
