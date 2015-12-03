package abc.player;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import abc.sound.Pitch;

//This class tests the Concat class in abc.player

public class ConcatTest {

    /*Testing Strategy*/
    
    //Constructor and toString():
    //2 rests, 2 SingleNotes, a rest and a SingleNote, two chords
    //2 Concats
    //2 Layers
    //combinations of the above
    
    //getDuration():
    //same partitions as above
    //return value is 2, >2 (can't be 1, since both m1 and m2 are ints)
    //m1 and m2 have same/different durations
    
    @Test //Concat(Rest, Rest), duration is >2
    public void testTwoRests() {
        Music rest1 = new Rest(2);
        Music rest2 = new Rest(2);
        Music music = new Concat(rest1, rest2);
        assertEquals("z4", music.toString());
        assertEquals(4, music.getDuration());
    }
    @Test //Concat(Rest, SingleNote), duration is 2, m1/m2 have same duration
    public void testRestAndSingleNote() {
        Music rest = new Rest(1);
        Music note = new SingleNote(1, new Pitch('C'));
        Music music = new Concat(rest, note);
        assertEquals("z1 C1", music.toString());
        assertEquals(2, music.getDuration());
    }
    @Test //Concat(SingeNote, Rest) (same test as above, switched ordering)
    public void testSingleNoteAndRest() {
        Music rest = new Rest(1);
        Music note = new SingleNote(1, new Pitch('C'));
        Music music = new Concat(note, rest);
        assertEquals("C1 z1", music.toString());
        assertEquals(2, music.getDuration());
    }
    @Test //Concat(SingleNote, SingleNote), m1 and m2 have different durations
    public void testTwoSingleNotes() {
        Music noteC = new SingleNote(3, new Pitch('C').transpose(12));
        Music noteG = new SingleNote(4, new Pitch('G'));
        Music music = new Concat(noteC, noteG);
        assertEquals("C'3 G4", music.toString());
        assertEquals(7, music.getDuration());
    }
    @Test
    public void testTwoChords() {
        SingleNote noteC = new SingleNote(3, new Pitch('C').transpose(12));
        SingleNote noteD = new SingleNote(4, new Pitch('D'));
        Music chord1 = new Chord(Arrays.asList(noteC, noteD));
        Music music = new Concat(chord1, chord1);
        assertEquals("[C'3D4] [C'3D4]", music.toString());
    }
}
