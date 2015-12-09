package abc.player;

import static org.junit.Assert.*;

import org.junit.Test;

public class RationalNumTest {

    /*Testing Strategy*/
    
    //RationalNum.LCM()
    //x = y, y > x, x < y
    // x,y = 1, x,y != 1
    
    //getNum() and getDenom()
    // num = 1, num > 1
    // denom = 1, denom > 1
    
    //getRationalNumber()
    // num = denom, num > denom, denom > num
    
    //toString()
    // num = denom, num > denom, denom > num
    
    //Constructors:
    //parse input where num = denom, num > denom, denom > num
    //(for int input and String input)

    
    @Test // x = 1, y = 1
    public void testLCMBothOne() {
        assertEquals(1, RationalNum.LCM(1, 1));
    }
    @Test // x > y
    public void testLCMXGreaterThanY() {
        assertEquals(12, RationalNum.LCM(4, 3));
    }
    @Test // y > x
    public void testLCMYGreaterThanX() {
        assertEquals(20, RationalNum.LCM(4, 5));
    }
    @Test //x = y and both > 1
    public void testLCMXEqualsY() {
        assertEquals(13, RationalNum.LCM(13, 13));
    }
    @Test
    public void testGetNumOne() {
        RationalNum number = new RationalNum(1, 4);
        assertEquals(1, number.getNum());
    }
    @Test
    public void testGetNumNonZero() {
        RationalNum number = new RationalNum(3, 1);
        assertEquals(3, number.getNum());
    }
    @Test
    public void testGetDenomOne() {
        RationalNum number = new RationalNum(3, 1);
        assertEquals(1, number.getDenom());
    }
    @Test
    public void testGetDenomNotOne() {
        RationalNum number = new RationalNum(3, 5);
        assertEquals(5, number.getDenom());
    }
    @Test
    public void testGetRationalNumberNumEqualsDenom() {
        RationalNum number = new RationalNum(4, 4);
        assertEquals(1.0, number.getRationalNumber(), .0001);
    }
    @Test
    public void testGetRationalNumberNumGreaterThanDenom() {
        RationalNum number = new RationalNum(4, 2);
        assertEquals(2.0, number.getRationalNumber(), .0001);
    }
    @Test
    public void testGetRationalNumberNumLessThanDenom() {
        RationalNum number = new RationalNum(5, 10);
        assertEquals(0.5, number.getRationalNumber(), .0001);
    }
    @Test
    public void testToStringNumEqualsDenom() {
        RationalNum number = new RationalNum(5, 5);
        assertEquals("5/5", number.toString());
    }
    @Test
    public void testToStringNumGreaterThanDenom() {
        RationalNum number = new RationalNum(3, 2);
        assertEquals("3/2", number.toString());
    }
    @Test
    public void testToStringNumLessThanDenom() {
        RationalNum number = new RationalNum(3, 4);
        assertEquals("3/4", number.toString());
    }
}
