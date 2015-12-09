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
    //duration is 1, >1
    
    //toString():
    //duration is 1, >1
    //Pitch = lower octave, middle octave, high octave

    @Test //notes.size() = 2, all lower octave
    public void testDupletLowerOctave() {
        Music noteC = new SingleNote(new RationalNum(1, 1), new Pitch('C').transpose(-12), 0);
        List<Music> notes = Arrays.asList(noteC, noteC);
        Music tuplet = new Tuplet(notes);
        assertEquals("(2C,1C,1", tuplet.toString());
    }
    @Test //notes.size() = 3, all middle octave
    public void testTripletMiddleOctave() {
        Music noteD = new SingleNote(new RationalNum(1, 1), new Pitch('D'), 0);
        List<Music> notes = Arrays.asList(noteD, noteD, noteD);
        Music tuplet = new Tuplet(notes);
        assertEquals("(3D1D1D1", tuplet.toString());
    }
    @Test //notes.size() = 3, all middle octave, all different
    public void testTripletDifferentNotes() {
        Music noteD = new SingleNote(new RationalNum(1, 1), new Pitch('D'), 0);
        Music noteE = new SingleNote(new RationalNum(1, 1), new Pitch('E'), 0);
        Music noteF = new SingleNote(new RationalNum(1, 1), new Pitch('F'), 0);
        List<Music> notes = Arrays.asList(noteD, noteE, noteF);
        Music tuplet = new Tuplet(notes);
        assertEquals("(3D1E1F1", tuplet.toString());
    }
    @Test //notes.size() = 4, all higher octave
    public void testQuadrupletHigherOctave() {
        Music noteC = new SingleNote(new RationalNum(1, 1), new Pitch('C').transpose(12), 1);
        List<Music> notes = Arrays.asList(noteC, noteC, noteC, noteC);
        Music tuplet = new Tuplet(notes);
        assertEquals("(4^C'1^C'1^C'1^C'1", tuplet.toString());
    }
    @Test //notes.size() = 3, all different octaves, some flat
    public void testTripletDifferentOctaves() {
        Music lowA = new SingleNote(new RationalNum(1, 1), new Pitch('A').transpose(-12), -1);
        Music midA = new SingleNote(new RationalNum(1, 1), new Pitch('A'), -2);
        Music highB = new SingleNote(new RationalNum(1, 1), new Pitch('B'), 0);
        List<Music> notes = Arrays.asList(lowA, midA, highB);
        Music tuplet = new Tuplet(notes);
        assertEquals("(3^G,1G1B1", tuplet.toString());
    }
}
