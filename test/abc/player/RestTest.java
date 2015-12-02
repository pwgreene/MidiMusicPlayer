package abc.player;

//This class tests the Rest class in abc.player

import static org.junit.Assert.*;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

import abc.sound.Pitch;
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
    @Test //tests duration = 1, atTick = 0
    public void testPlayDurationOne() throws MidiUnavailableException, InvalidMidiDataException {
        Music rest = new Rest(1);
        SequencePlayer player = new SequencePlayer(100, 4);
        rest.play(player, 0);
        assertEquals("Meta event: END_OF_TRACK Tick: 0\n", player.toString());
    }
    @Test //tests duration >1, atTick = 0
    public void testPlayDurationGreaterThanOne() throws MidiUnavailableException, InvalidMidiDataException {
        Music rest = new Rest(5);
        SequencePlayer player = new SequencePlayer(100, 4);
        rest.play(player, 0);
        assertEquals("Meta event: END_OF_TRACK Tick: 0\n", player.toString());
    }
    @Test //tests atTick >0
    public void testPlayAtTickNonZero() throws MidiUnavailableException, InvalidMidiDataException {
        Music rest = new Rest(4);
        SequencePlayer player = new SequencePlayer(10, 5);
        rest.play(player, 5);
        assertEquals("Meta event: END_OF_TRACK Tick: 0\n", player.toString());
    }
}
