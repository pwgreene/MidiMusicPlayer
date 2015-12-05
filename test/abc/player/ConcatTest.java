package abc.player;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import abc.sound.Pitch;

//This class tests the Concat class in abc.player

public class ConcatTest {

    /*Testing Strategy*/
    
    //Constructor and toString():
    //2 rests, 2 SingleNotes, 2 Chords, 2 Concats, 2 Layers
    //combinations of the Rest/SingleNote/Chord/Layer/Concat
    
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
    @Test //Concat(Chord, Chord)
    public void testTwoChords() {
        SingleNote noteC = new SingleNote(3, new Pitch('C').transpose(12));
        SingleNote noteD = new SingleNote(4, new Pitch('D'));
        Music chord1 = new Chord(Arrays.asList(noteC, noteD));
        Music music = new Concat(chord1, chord1);
        assertEquals("[C'3D4] [C'3D4]", music.toString());
        assertEquals(8, music.getDuration());
    }
    @Test //Concat(Chord, SingleNote)
    public void testChordAndSingleNote() {
        SingleNote noteC = new SingleNote(3, new Pitch('C').transpose(12));
        SingleNote noteG = new SingleNote(4, new Pitch('G'));
        Music chord1 = new Chord(Arrays.asList(noteC, noteG));
        Music music = new Concat(chord1, noteG);
        assertEquals("[C'3G4] G4", music.toString());
        assertEquals(8, music.getDuration());
    }
    @Test //Concat(Concat, Concat)
    public void testTwoConcat() {
        SingleNote noteC = new SingleNote(3, new Pitch('C').transpose(12));
        SingleNote noteG = new SingleNote(4, new Pitch('G'));
        SingleNote noteA = new SingleNote(6, new Pitch('A'));
        Music chord1 = new Chord(Arrays.asList(noteC, noteG));
        Music concat1 = new Concat(chord1, noteG); //[C'3G4] G4
        Music concat2 = new Concat(noteG, noteA); //G4 A6
        Music music = new Concat(concat1, concat2);
        assertEquals("[C'3G4] G4 G4 A6", music.toString());
        assertEquals(18, music.getDuration());
    }
    @Test //Concat(Concat, SingleNote)
    public void testConcatAndSingleNote() {
        SingleNote noteG = new SingleNote(4, new Pitch('G'));
        SingleNote noteA = new SingleNote(6, new Pitch('A'));
        Music concat = new Concat(noteG, noteG); //[C'3G4] G4
        Music music = new Concat(noteA, concat); //G4 A6
        assertEquals("A6 G4 G4", music.toString());
        assertEquals(14, music.getDuration());
    }
    @Test //Concat(Layer, Layer)
    public void testTwoLayers() {
        SingleNote noteC = new SingleNote(2, new Pitch('C').transpose(-12));
        SingleNote noteG = new SingleNote(4, new Pitch('G'));
        Music concat = new Concat(noteG, noteG); //[C'3G4] G4
        Music chord1 = new Chord(Arrays.asList(noteC, noteG)); //[C,2G4]
        Music layer1 = new Layer(concat, chord1);
        Music layer2 = new Layer(layer1, concat);
        Music ConcatOfLayers = new Concat(layer1, layer2);
        assertEquals("G4 G4\n[C,2G4] G4 G4\n[C,2G4]\nG4 G4", ConcatOfLayers.toString());
        assertEquals(16, ConcatOfLayers.getDuration());
    }
    @Test //Layer(Layer, Concat)
    public void testLayerAndConcat() {
        SingleNote noteG = new SingleNote(2, new Pitch('G').transpose(12));
        SingleNote noteF = new SingleNote(5, new Pitch('F'));
        Music concat = new Concat(noteG, noteF); //G'2 F5
        Music layer = new Layer(noteF, noteG);
        Music music = new Concat(layer, concat);
        assertEquals("F5\nG'2 G'2 F5", music.toString());
        assertEquals(12, music.getDuration());
    }
}
