package abc.player;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import abc.sound.Pitch;

/**
 * Testing suite for the Tuplet Class
 *
 */
public class TupletTest {
    
/*Testing Strategy*/
    
    //Constructor:
    //notes.size() = 2, 3, 4
    //Pitch = lower octave, middle octave, high octave
    //all notes are same, some same, all different
    
    //toString():
    //notes.size() = 2, 3, 4
    //Pitch = lower octave, middle octave, high octave
    //has sharp, natural, flat
    
    //getDuration():
    //Tuplet is a duplet/triplet/quadruplet
    //duration is 1, >1
    
    //toString():
    //duration is 1, >1
    //Pitch = lower octave, middle octave, high octave

    @Test //notes.size() = 2, all lower octave
    public void testDupletLowerOctave() {
        Music noteC = new SingleNote(new RationalNum(1, 1), new Pitch('C').transpose(-12));
        List<Music> notes = Arrays.asList(noteC, noteC);
        Music tuplet = new Tuplet(notes);
        assertEquals("(2C,1C,1", tuplet.toString());
    }
    @Test //notes.size() = 3, all middle octave
    public void testTripletMiddleOctave() {
        Music noteD = new SingleNote(new RationalNum(1, 1), new Pitch('D'));
        List<Music> notes = Arrays.asList(noteD, noteD, noteD);
        Music tuplet = new Tuplet(notes);
        assertEquals("(3D1D1D1", tuplet.toString());
    }
    @Test //notes.size() = 3, all middle octave, all different
    public void testTripletDifferentNotes() {
        Music noteD = new SingleNote(new RationalNum(1, 1), new Pitch('D'));
        Music noteE = new SingleNote(new RationalNum(1, 1), new Pitch('E'));
        Music noteF = new SingleNote(new RationalNum(1, 1), new Pitch('F'));
        List<Music> notes = Arrays.asList(noteD, noteE, noteF);
        Music tuplet = new Tuplet(notes);
        assertEquals("(3D1E1F1", tuplet.toString());
    }
    @Test //notes.size() = 4, all higher octave
    public void testQuadrupletHigherOctave() {
        Music noteC = new SingleNote(new RationalNum(1, 1), new Pitch('C').transpose(13));
        List<Music> notes = Arrays.asList(noteC, noteC, noteC, noteC);
        Music tuplet = new Tuplet(notes);
        assertEquals("(4^C'1^C'1^C'1^C'1", tuplet.toString());
    }
    @Test //notes.size() = 3, all different octaves, some flat
    public void testTripletDifferentOctaves() {
        Music lowA = new SingleNote(new RationalNum(1, 1), new Pitch('A').transpose(-13));
        Music midA = new SingleNote(new RationalNum(1, 1), new Pitch('A').transpose(-2));
        Music highB = new SingleNote(new RationalNum(1, 1), new Pitch('B'));
        List<Music> notes = Arrays.asList(lowA, midA, highB);
        Music tuplet = new Tuplet(notes);
        assertEquals("(3^G,1G1B1", tuplet.toString());
    }
    @Test //get duration on a duplet
    public void getDurationDuplet() {
        Music noteC = new SingleNote(new RationalNum(1,1), new Pitch('C'));
        List<Music> notes = Arrays.asList(noteC, noteC);
        Music tuplet = new Tuplet(notes);
        assertEquals(3.0, tuplet.getDuration().getRationalNumber(), .0001);
    }
    @Test //get duration on a triplet
    public void getDurationTriplet() {
        Music lowA = new SingleNote(new RationalNum(1, 1), new Pitch('A').transpose(-13));
        Music midA = new SingleNote(new RationalNum(1, 1), new Pitch('A').transpose(-2));
        Music highB = new SingleNote(new RationalNum(1, 1), new Pitch('B'));
        List<Music> notes = Arrays.asList(lowA, midA, highB);
        Music tuplet = new Tuplet(notes);
        assertEquals(2.0, tuplet.getDuration().getRationalNumber(), .0001);
    }
    @Test //get duration on a quadruplet
    public void getDurationQuadruplet() {
        Music noteG = new SingleNote(new RationalNum(1,1), new Pitch('G'));
        List<Music> notes = Arrays.asList(noteG, noteG, noteG, noteG);
        Music tuplet = new Tuplet(notes);
        assertEquals(3.0, tuplet.getDuration().getRationalNumber(), .0001);
    }
}
