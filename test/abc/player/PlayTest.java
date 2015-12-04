package abc.player;

import static org.junit.Assert.assertEquals;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

import abc.sound.Pitch;
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
    
  //Chord.play():
    //# of notes: 2, >2
    //Notes of the same/different durations 
    
    //SingleNote.play()
    //duration  = 1, >1
    //pitch is in lower/middle/high octave
    //sharp/natural/flat
    //play atTick = 0, >0
    
    @Test //note of duration 1 at tick 0, middle octave, natural
    public void testSingleNotePlayDurationOne() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteA = new SingleNote(1, new Pitch('A'));
        SequencePlayer player = new SequencePlayer(100, 5);
        noteA.play(player, 0);
        assertEquals("Event: NOTE_ON  Pitch: 69  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 69  Tick: 1\n"
                    + "Meta event: END_OF_TRACK Tick: 1\n", player.toString());
    }
    @Test //note of duration >1, plays atTick >0
    public void testSingleNotePlayDurationGreaterThanOne() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteA = new SingleNote(10, new Pitch('A'));
        SequencePlayer player = new SequencePlayer(100, 5);
        noteA.play(player, 5);
        assertEquals("Event: NOTE_ON  Pitch: 69  Tick: 5\n" 
                    + "Event: NOTE_OFF Pitch: 69  Tick: 15\n"
                    + "Meta event: END_OF_TRACK Tick: 15\n", player.toString());
    }
    @Test //note is lower octave, natural (A,)
    public void testSingleNotePlayLowerOctave() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteA = new SingleNote(10, new Pitch('A').transpose(-12));
        SequencePlayer player = new SequencePlayer(100, 5);
        noteA.play(player, 5);
        assertEquals("Event: NOTE_ON  Pitch: 57  Tick: 5\n" 
                    + "Event: NOTE_OFF Pitch: 57  Tick: 15\n"
                    + "Meta event: END_OF_TRACK Tick: 15\n", player.toString());
    }
    @Test //note is higher octave, natural (B')
    public void testSingleNotePlayHigherOctave() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteA = new SingleNote(10, new Pitch('B').transpose(12));
        SequencePlayer player = new SequencePlayer(100, 5);
        noteA.play(player, 0);
        assertEquals("Event: NOTE_ON  Pitch: 83  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 83  Tick: 10\n"
                    + "Meta event: END_OF_TRACK Tick: 10\n", player.toString());
    }
    @Test //note is sharp
    public void testSingleNotePlaySharp() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteC = new SingleNote(10, new Pitch('C').transpose(1));
        SequencePlayer player = new SequencePlayer(100, 5);
        noteC.play(player, 0);
        assertEquals("Event: NOTE_ON  Pitch: 61  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 61  Tick: 10\n"
                    + "Meta event: END_OF_TRACK Tick: 10\n", player.toString());
    }
    @Test //note is flat
    public void testSingleNotePlayFlat() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteC = new SingleNote(30, new Pitch('C').transpose(-1));
        SequencePlayer player = new SequencePlayer(100, 5);
        noteC.play(player, 0);
        assertEquals("Event: NOTE_ON  Pitch: 59  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 59  Tick: 30\n"
                    + "Meta event: END_OF_TRACK Tick: 30\n", player.toString());
    }
    
    //Concat.play()
    
    //Layer.play()
}
