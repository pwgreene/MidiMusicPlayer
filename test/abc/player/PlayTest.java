package abc.player;

import static org.junit.Assert.assertEquals;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

import abc.sound.SequencePlayer;

/**
 * A class for testing the implementers of the Music type, ignored by didit
 * @category no_didit
 *
 */
public class PlayTest {
  
    //Rest.play():
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
