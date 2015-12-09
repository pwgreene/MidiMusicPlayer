package abc.player;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

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
        Music rest = new Rest(new RationalNum(1, 1));
        SequencePlayer player = new SequencePlayer(100, 4);
        rest.play(player, 0, 1);
        assertEquals("Meta event: END_OF_TRACK Tick: 0\n", player.toString());
    }
    @Test //tests duration >1, atTick = 0
    public void testPlayDurationGreaterThanOne() throws MidiUnavailableException, InvalidMidiDataException {
        Music rest = new Rest(new RationalNum(5, 1));
        SequencePlayer player = new SequencePlayer(100, 4);
        rest.play(player, 0, 1);
        assertEquals("Meta event: END_OF_TRACK Tick: 0\n", player.toString());
    }
    @Test //tests atTick >0
    public void testPlayAtTickNonZero() throws MidiUnavailableException, InvalidMidiDataException {
        Music rest = new Rest(new RationalNum(4, 1));
        SequencePlayer player = new SequencePlayer(10, 5);
        rest.play(player, 5, 1);
        assertEquals("Meta event: END_OF_TRACK Tick: 0\n", player.toString());
    }
    
  //Chord.play():
    //# of notes: 2, >2
    //Notes of the same/different durations 
    
    @Test //notes have duration 1 at tick 0, middle octave, natural
    public void testChordPlayDurationOne() 
            throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteA = new SingleNote(new RationalNum(1,1), new Pitch('A'), 0);
        SingleNote noteB = new SingleNote(new RationalNum(1,1), new Pitch('B'), 0);
        Music chord = new Chord(Arrays.asList(noteA, noteB));
        SequencePlayer player = new SequencePlayer(100, 5);
        chord.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 69  Tick: 0\n" 
                    + "Event: NOTE_ON  Pitch: 71  Tick: 0\n"
                    + "Event: NOTE_OFF Pitch: 69  Tick: 1\n"
                    + "Event: NOTE_OFF Pitch: 71  Tick: 1\n"
                    + "Meta event: END_OF_TRACK Tick: 1\n", player.toString());
    }
    @Test //notes have same of durations >1, plays atTick >0
    public void testChordPlayDurationGreaterThanOne() 
            throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteA = new SingleNote(new RationalNum(10,1), new Pitch('A'), 0);
        SingleNote noteC = new SingleNote(new RationalNum(10,1), new Pitch('C'), 0);
        Music chord = new Chord(Arrays.asList(noteA, noteC));
        SequencePlayer player = new SequencePlayer(100, 5);
        chord.play(player, 5, 1);
        assertEquals("Event: NOTE_ON  Pitch: 69  Tick: 5\n" 
                    + "Event: NOTE_ON  Pitch: 60  Tick: 5\n"
                    + "Event: NOTE_OFF Pitch: 69  Tick: 15\n"
                    + "Event: NOTE_OFF Pitch: 60  Tick: 15\n"
                    + "Meta event: END_OF_TRACK Tick: 15\n", player.toString());
    }
    @Test //notes have different durations >1
    public void testChordDifferentNoteDurations()  
            throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteA = new SingleNote(new RationalNum(10, 1), new Pitch('A'), 0);
        SingleNote noteC = new SingleNote(new RationalNum(5, 1), new Pitch('C'), 0);
        Music chord = new Chord(Arrays.asList(noteA, noteC));
        SequencePlayer player = new SequencePlayer(100, 5);
        chord.play(player, 5, 1);
        assertEquals("Event: NOTE_ON  Pitch: 69  Tick: 5\n" 
                    + "Event: NOTE_ON  Pitch: 60  Tick: 5\n"
                    + "Event: NOTE_OFF Pitch: 60  Tick: 10\n"
                    + "Event: NOTE_OFF Pitch: 69  Tick: 15\n"
                    + "Meta event: END_OF_TRACK Tick: 15\n", player.toString());
    }
    @Test //both notes are lower octave, natural (A,)
    public void testChordPlayLowerOctave() 
            throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteA = new SingleNote(new RationalNum(10, 1), new Pitch('A').transpose(-12), 0);
        SingleNote noteB = new SingleNote(new RationalNum(10, 1), new Pitch('B').transpose(-12), 0);
        Music chord = new Chord(Arrays.asList(noteA, noteB));
        SequencePlayer player = new SequencePlayer(100, 5);
        chord.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 57  Tick: 0\n"
                    + "Event: NOTE_ON  Pitch: 59  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 57  Tick: 10\n"
                    + "Event: NOTE_OFF Pitch: 59  Tick: 10\n"
                    + "Meta event: END_OF_TRACK Tick: 10\n", player.toString());
    }
    @Test //both notes are higher octave, natural (B' and D')
    public void testChordPlayHigherOctave() throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteB = new SingleNote(new RationalNum(10, 1), new Pitch('B').transpose(12), 0);
        SingleNote noteD = new SingleNote(new RationalNum(10, 1), new Pitch('D').transpose(12), 0);
        Music chord = new Chord(Arrays.asList(noteB, noteD));
        SequencePlayer player = new SequencePlayer(100, 5);
        chord.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 83  Tick: 0\n" 
                    + "Event: NOTE_ON  Pitch: 74  Tick: 0\n"
                    + "Event: NOTE_OFF Pitch: 83  Tick: 10\n"
                    + "Event: NOTE_OFF Pitch: 74  Tick: 10\n"
                    + "Meta event: END_OF_TRACK Tick: 10\n", player.toString());
    }
    @Test //notes are sharp
    public void testChordPlayFlatAndSharp() throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteC = new SingleNote(new RationalNum(10, 1), new Pitch('C'), 1);
        SingleNote noteF = new SingleNote(new RationalNum(10, 1), new Pitch('F'), 1);
        Music chord = new Chord(Arrays.asList(noteC, noteF));
        SequencePlayer player = new SequencePlayer(100, 5);
        chord.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 61  Tick: 0\n" 
                    + "Event: NOTE_ON  Pitch: 66  Tick: 0\n"
                    + "Event: NOTE_OFF Pitch: 61  Tick: 10\n"
                    + "Event: NOTE_OFF Pitch: 66  Tick: 10\n"
                    + "Meta event: END_OF_TRACK Tick: 10\n", player.toString());
    }
    @Test //# of notes >2
    public void testChordPlayThreeNotes() throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteC = new SingleNote(new RationalNum(30, 1), new Pitch('C'), -1);
        SingleNote noteA = new SingleNote(new RationalNum(20, 1), new Pitch('A'), 0);
        SingleNote noteE = new SingleNote(new RationalNum(15, 1), new Pitch('E'), 0);
        Music chord = new Chord(Arrays.asList(noteC, noteA, noteE));
        SequencePlayer player = new SequencePlayer(100, 5);
        chord.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 59  Tick: 0\n" 
                + "Event: NOTE_ON  Pitch: 69  Tick: 0\n"
                + "Event: NOTE_ON  Pitch: 64  Tick: 0\n"
                + "Event: NOTE_OFF Pitch: 64  Tick: 15\n"
                + "Event: NOTE_OFF Pitch: 69  Tick: 20\n"
                + "Event: NOTE_OFF Pitch: 59  Tick: 30\n"
                + "Meta event: END_OF_TRACK Tick: 30\n", player.toString());
    }
    
    //SingleNote.play()
    //duration  = 1, >1
    //pitch is in lower/middle/high octave
    //sharp/natural/flat
    //play atTick = 0, >0
    //accidental = sharp, natural, flat
    
    @Test //note of duration 1 at tick 0, middle octave, natural
    public void testSingleNotePlayDurationOne() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteA = new SingleNote(new RationalNum(1, 1), new Pitch('A'), 0);
        SequencePlayer player = new SequencePlayer(100, 5);
        noteA.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 69  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 69  Tick: 1\n"
                    + "Meta event: END_OF_TRACK Tick: 1\n", player.toString());
    }
    @Test //note of duration >1, plays atTick >0
    public void testSingleNotePlayDurationGreaterThanOne() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteA = new SingleNote(new RationalNum(10, 1), new Pitch('A'), 0);
        SequencePlayer player = new SequencePlayer(100, 5);
        noteA.play(player, 5, 1);
        assertEquals("Event: NOTE_ON  Pitch: 69  Tick: 5\n" 
                    + "Event: NOTE_OFF Pitch: 69  Tick: 15\n"
                    + "Meta event: END_OF_TRACK Tick: 15\n", player.toString());
    }
    @Test //note is lower octave, natural (A,)
    public void testSingleNotePlayLowerOctave() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteA = new SingleNote(new RationalNum(10, 1), new Pitch('A').transpose(-12), 0);
        SequencePlayer player = new SequencePlayer(100, 5);
        noteA.play(player, 5, 1);
        assertEquals("Event: NOTE_ON  Pitch: 57  Tick: 5\n" 
                    + "Event: NOTE_OFF Pitch: 57  Tick: 15\n"
                    + "Meta event: END_OF_TRACK Tick: 15\n", player.toString());
    }
    @Test //note is higher octave, natural (B')
    public void testSingleNotePlayHigherOctave() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteA = new SingleNote(new RationalNum(10, 1), new Pitch('B').transpose(12), 0);
        SequencePlayer player = new SequencePlayer(100, 5);
        noteA.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 83  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 83  Tick: 10\n"
                    + "Meta event: END_OF_TRACK Tick: 10\n", player.toString());
    }
    @Test //note is sharp
    public void testSingleNotePlaySharp() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteC = new SingleNote(new RationalNum(10,1), new Pitch('C'), 1);
        SequencePlayer player = new SequencePlayer(100, 5);
        noteC.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 61  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 61  Tick: 10\n"
                    + "Meta event: END_OF_TRACK Tick: 10\n", player.toString());
    }
    @Test //note is flat
    public void testSingleNotePlayFlat() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteC = new SingleNote(new RationalNum(30, 1), new Pitch('C'), -2);
        SequencePlayer player = new SequencePlayer(100, 5);
        noteC.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 58  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 58  Tick: 30\n"
                    + "Meta event: END_OF_TRACK Tick: 30\n", player.toString());
    }
    
    
}
