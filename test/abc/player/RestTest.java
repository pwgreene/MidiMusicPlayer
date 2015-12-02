package abc.player;

//This class tests the Rest class in abc.player

import static org.junit.Assert.*;

import org.junit.Test;

public class RestTest {

    /*Testing Strategy*/
    
    //Constructor:
    //duration = 0, 1, >1
    
    //toString():
    //rest duration is 0, 1, >1
    
    //getDuration():
    //rest duration is 0, 1, >1
    
    @Test
    public void testRestDurationZero() {
        Music rest = new Rest(0);
        assertEquals("", rest.toString());
        assertEquals(0, rest.getDuration());
    }
    
    @Test
    public void testRestDurationOne() {
        Music rest = new Rest(1);
        assertEquals("-", rest.toString());
        assertEquals(1, rest.getDuration());
    }
    
    @Test
    public void testRestDurationGreaterThanOne() {
        Music rest = new Rest(5);
        assertEquals("- - - - -", rest.toString());
        assertEquals(5, rest.getDuration());
    }
    
    //transpose():
    //transpose by semitonesUp = <0, 0, >0
    
    @Test
    public void testDurationTransposeNegative() {
        Music rest = new Rest(5);
        Music rest2 = rest.transpose(-1);
        assertEquals("-", rest2.toString());
    }
    @Test
    public void testDurationTransposeZero() {
        Music rest = new Rest(5);
        Music rest2 = rest.transpose(0);
        assertEquals("-", rest2.toString());
    }
    @Test
    public void testDurationTransposePositive() {
        Music rest = new Rest(5);
        Music rest2 = rest.transpose(3);
        assertEquals("-", rest2.toString());
    }
    
    //play():
    //No way to test this?
}
