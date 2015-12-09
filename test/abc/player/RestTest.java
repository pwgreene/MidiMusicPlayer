package abc.player;

//This class tests the Rest class in abc.player

import static org.junit.Assert.*;
import org.junit.Test;


public class RestTest {

    /*Testing Strategy*/
    
    //Constructor:
    //duration = 1, >1
    
    //toString():
    //rest duration is 1, >1
    
    //getDuration():
    //rest duration is 1, >1
    
    @Test
    public void testRestDurationOne() {
        Music rest = new Rest(new RationalNum(1, 1));
        assertEquals("z1", rest.toString());
        assertEquals(new RationalNum(1, 1), rest.getDuration());
    }
    
    @Test
    public void testRestDurationGreaterThanOne() {
        Music rest = new Rest(new RationalNum(5, 1));
        assertEquals("z5", rest.toString());
        assertEquals(new RationalNum(5, 1), rest.getDuration());
    }
    
}
