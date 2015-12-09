package abc.player;

import static org.junit.Assert.*;

import org.junit.Test;

import abc.sound.Pitch;

//This class tests the SingleNote class in abc.player

public class SingleNoteTest {

    /*Testing Strategy*/
    
    //Constructor:
    //duration =  1, >1
    //Pitch = lower octave, middle octave, high octave
    
    //toString():
    //duration is  1, >1
    //Pitch = lower octave, middle octave, high octave
    
    //getDuration():
    //duration is  1, >1
    
    //toString():
    //duration is 1, >1
    //Pitch = lower octave, middle octave, high octave
    
    @Test //duration = 1
    public void testToStringDurationOne() {
        Music noteA = new SingleNote(new RationalNum(1, 1), new Pitch('A'));
        assertEquals(new RationalNum(1,1), noteA.getDuration());
        assertEquals("A1", noteA.toString());
    }
    @Test //duration > 1
    public void testToStringDurationGreaterThanOne() {
        Music noteA = new SingleNote(new RationalNum(10, 1), new Pitch('A'));
        assertEquals(new RationalNum(10, 1) , noteA.getDuration());
        assertEquals("A10", noteA.toString());
    }
    @Test
    public void testToStringLowerOctave() {
        Music noteA = new SingleNote(new RationalNum(10, 1), new Pitch('A').transpose(-12));
        assertEquals("A,10", noteA.toString());
    }
    @Test //middle octave, sharp
    public void testToStringMiddleOctave() {
        Music noteC = new SingleNote(new RationalNum(10,1), new Pitch('C').transpose(1));
        assertEquals("^C10", noteC.toString());
    }
    @Test //higher octave
    public void testToStringHigherOctave() {
        Music noteA = new SingleNote(new RationalNum(10, 1), new Pitch('B').transpose(12));     
        assertEquals("B'10", noteA.toString());
    }
    @Test //middle octave, flat
    public void testToStringFlatNote() {
        Music noteC = new SingleNote(new RationalNum(1,1), new Pitch('C').transpose(-1));
        assertEquals("B,1", noteC.toString());
    }
}
