package abc.player;

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
        Rest rest = new Rest(0);
        assertEquals("", rest.toString());
        assertEquals(0, rest.getDuration());
    }
    
    @Test
    public void testRestDurationOne() {
        Rest rest = new Rest(1);
        assertEquals("-", rest.toString());
        assertEquals(1, rest.getDuration());
    }
    
    @Test
    public void testRestDurationGreaterThanOne() {
        Rest rest = new Rest(5);
        assertEquals("- - - - -", rest.toString());
        assertEquals(5, rest.getDuration());
    }
    
    //transpose():
    //transpose by semitonesUp = <0, 0, >0
    
    //play():
    //No way to test this?
}
