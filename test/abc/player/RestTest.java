package abc.player;

//This class tests the Rest class in abc.player

import static org.junit.Assert.*;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

import abc.sound.SequencePlayer;

public class RestTest {

    /*Testing Strategy*/
    
    //Constructor:
    //duration = 0, 1, >1
    
    //toString():
    //rest duration is 0, 1, >1
    
    //getDuration():
    //rest duration is 0, 1, >1
    
    @Test
    public void testRestDurationOne() {
        Music rest = new Rest(1);
        assertEquals("z1", rest.toString());
        assertEquals(1, rest.getDuration());
    }
    
    @Test
    public void testRestDurationGreaterThanOne() {
        Music rest = new Rest(5);
        assertEquals("z5", rest.toString());
        assertEquals(5, rest.getDuration());
    }
    
    //play():
    //duration = 1, >1
    //atTick = 0, >0
    @Test
    public void testRestPlayDurationOne() throws MidiUnavailableException, InvalidMidiDataException {
        Music rest = new Rest(1);
        SequencePlayer player = new SequencePlayer(100, 4);
        System.out.println(player.toString());
        rest.play(player, 0);
        assertEquals("", player.toString());
    }
}
