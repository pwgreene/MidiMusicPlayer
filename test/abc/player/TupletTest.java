package abc.player;

import org.junit.Test;

/**
 * Testing suite for the Tuplet Class
 *
 */
public class TupletTest {
    
/*Testing Strategy*/
    
    //Constructor:
    //notes.size() = 2, 3, 4
    //Pitch = lower octave, middle octave, high octave
    
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
        
    }
    @Test //notes.size() = 3, all middle octave
    public void testTripletMiddleOctave() {
        
    }
    @Test //notes.size() = 4, all higher octave
    public void testQuadrupletHigherOctave() {
        
    }
    @Test //notes.size() = 3, all different octaves
    public void testTripletDifferentOctaves() {
        
    }
}
