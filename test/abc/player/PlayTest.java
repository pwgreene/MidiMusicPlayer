package abc.player;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

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
    //atSpeed = 1, > 1
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
    @Test //tests atTick >0, atSpeed > 0
    public void testPlayAtSpeedNonZero() throws MidiUnavailableException, InvalidMidiDataException {
        Music rest = new Rest(new RationalNum(4, 1));
        SequencePlayer player = new SequencePlayer(10, 5);
        rest.play(player, 5, 2);
        assertEquals("Meta event: END_OF_TRACK Tick: 0\n", player.toString());
    }
    
  //Chord.play():
    //# of notes: 2, >2
    //Notes of the same/different durations 
    
    @Test //notes have duration 1 at tick 0, middle octave, natural
    public void testChordPlayDurationOne() 
            throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteA = new SingleNote(new RationalNum(1,1), new Pitch('A'));
        SingleNote noteB = new SingleNote(new RationalNum(1,1), new Pitch('B'));
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
        SingleNote noteA = new SingleNote(new RationalNum(10,1), new Pitch('A'));
        SingleNote noteC = new SingleNote(new RationalNum(10,1), new Pitch('C'));
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
        SingleNote noteA = new SingleNote(new RationalNum(10, 1), new Pitch('A'));
        SingleNote noteC = new SingleNote(new RationalNum(5, 1), new Pitch('C'));
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
        SingleNote noteA = new SingleNote(new RationalNum(10, 1), new Pitch('A').transpose(-12));
        SingleNote noteB = new SingleNote(new RationalNum(10, 1), new Pitch('B').transpose(-12));
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
        SingleNote noteB = new SingleNote(new RationalNum(10, 1), new Pitch('B').transpose(12));
        SingleNote noteD = new SingleNote(new RationalNum(10, 1), new Pitch('D').transpose(12));
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
        SingleNote noteC = new SingleNote(new RationalNum(10, 1), new Pitch('C').transpose(1));
        SingleNote noteF = new SingleNote(new RationalNum(10, 1), new Pitch('F').transpose(1));
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
        SingleNote noteC = new SingleNote(new RationalNum(30, 1), new Pitch('C').transpose(-1));
        SingleNote noteA = new SingleNote(new RationalNum(20, 1), new Pitch('A'));
        SingleNote noteE = new SingleNote(new RationalNum(15, 1), new Pitch('E'));
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
    //atSpeed = 1, >1
    
    @Test //note of duration 1 at tick 0, middle octave, natural, atSpeed = 1
    public void testSingleNotePlayDurationOne() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteA = new SingleNote(new RationalNum(1, 1), new Pitch('A'));
        SequencePlayer player = new SequencePlayer(100, 5);
        noteA.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 69  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 69  Tick: 1\n"
                    + "Meta event: END_OF_TRACK Tick: 1\n", player.toString());
    }
    @Test //note of duration >1, plays atTick >0, atSpeed > 1
    public void testSingleNotePlayDurationGreaterThanOne() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteA = new SingleNote(new RationalNum(10, 1), new Pitch('A'));
        SequencePlayer player = new SequencePlayer(100, 1);
        noteA.play(player, 5, 2);
        assertEquals("Event: NOTE_ON  Pitch: 69  Tick: 5\n" 
                    + "Event: NOTE_OFF Pitch: 69  Tick: 25\n"
                    + "Meta event: END_OF_TRACK Tick: 25\n", player.toString());
    }
    @Test //note is lower octave, natural (A,)
    public void testSingleNotePlayLowerOctave() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteA = new SingleNote(new RationalNum(10, 1), new Pitch('A').transpose(-12));
        SequencePlayer player = new SequencePlayer(100, 5);
        noteA.play(player, 5, 1);
        assertEquals("Event: NOTE_ON  Pitch: 57  Tick: 5\n" 
                    + "Event: NOTE_OFF Pitch: 57  Tick: 15\n"
                    + "Meta event: END_OF_TRACK Tick: 15\n", player.toString());
    }
    @Test //note is higher octave, natural (B')
    public void testSingleNotePlayHigherOctave() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteA = new SingleNote(new RationalNum(10, 1), new Pitch('B').transpose(12));
        SequencePlayer player = new SequencePlayer(100, 5);
        noteA.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 83  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 83  Tick: 10\n"
                    + "Meta event: END_OF_TRACK Tick: 10\n", player.toString());
    }
    @Test //note is sharp
    public void testSingleNotePlaySharp() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteC = new SingleNote(new RationalNum(10,1), new Pitch('C').transpose(1));
        SequencePlayer player = new SequencePlayer(100, 5);
        noteC.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 61  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 61  Tick: 10\n"
                    + "Meta event: END_OF_TRACK Tick: 10\n", player.toString());
    }
    @Test //note is flat
    public void testSingleNotePlayFlat() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteC = new SingleNote(new RationalNum(30, 1), new Pitch('C').transpose(-2));
        SequencePlayer player = new SequencePlayer(100, 5);
        noteC.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 58  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 58  Tick: 30\n"
                    + "Meta event: END_OF_TRACK Tick: 30\n", player.toString());
    }
    
    //Tuplet.play()
    //Partitions:
     //duration  = 1, >1
     //pitch is in lower/middle/high octave
     //sharp/natural/flat
     //play atTick = 0, >0
     //notes.size = 2, 3, 4
    
    @Test //notes.size() = 2, all lower octave, play atSpeed = 1, atTick = 1
    public void testTupletLowerOctave() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteC = new SingleNote(new RationalNum(1, 1), new Pitch('C').transpose(-12));
        List<Music> notes = Arrays.asList(noteC, noteC);
        Music tuplet = new Tuplet(notes);
        SequencePlayer player = new SequencePlayer(100, 1);
        tuplet.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 48  Tick: 0\n" 
                   + "Event: NOTE_OFF Pitch: 48  Tick: 1\n"
                   + "Event: NOTE_ON  Pitch: 48  Tick: 1\n" 
                   + "Event: NOTE_OFF Pitch: 48  Tick: 2\n"
                   + "Meta event: END_OF_TRACK Tick: 2\n", player.toString());
    }
    @Test //notes.size() = 3, all middle octave, play atSpeed = 1
    public void testTupletMiddleOctave() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteD = new SingleNote(new RationalNum(1, 1), new Pitch('D'));
        List<Music> notes = Arrays.asList(noteD, noteD, noteD);
        Music tuplet = new Tuplet(notes);
        SequencePlayer player = new SequencePlayer(140, 1);
        tuplet.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 62  Tick: 0\n" 
                + "Event: NOTE_OFF Pitch: 62  Tick: 1\n"
                + "Event: NOTE_ON  Pitch: 62  Tick: 1\n" 
                + "Event: NOTE_OFF Pitch: 62  Tick: 2\n"
                + "Event: NOTE_ON  Pitch: 62  Tick: 2\n" 
                + "Event: NOTE_OFF Pitch: 62  Tick: 3\n"
                + "Meta event: END_OF_TRACK Tick: 3\n", player.toString());
    }
    @Test //notes.size() = 3, all middle octave, all different, play atSpeed = 1
    public void testTuplettDifferentNotes() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteD = new SingleNote(new RationalNum(1, 1), new Pitch('D'));
        Music noteE = new SingleNote(new RationalNum(1, 1), new Pitch('E'));
        Music noteF = new SingleNote(new RationalNum(1, 1), new Pitch('F'));
        List<Music> notes = Arrays.asList(noteD, noteE, noteF);
        Music tuplet = new Tuplet(notes);
        SequencePlayer player = new SequencePlayer(140, 1);
        tuplet.play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 62  Tick: 0\n" 
                + "Event: NOTE_OFF Pitch: 62  Tick: 1\n"
                + "Event: NOTE_ON  Pitch: 64  Tick: 1\n" 
                + "Event: NOTE_OFF Pitch: 64  Tick: 2\n"
                + "Event: NOTE_ON  Pitch: 65  Tick: 2\n" 
                + "Event: NOTE_OFF Pitch: 65  Tick: 3\n"
                + "Meta event: END_OF_TRACK Tick: 3\n", player.toString());
    }
    @Test //notes.size() = 4, all higher octave, play atSpeed > 1
    public void testTupletHigherOctave() throws MidiUnavailableException, InvalidMidiDataException {
        Music noteC = new SingleNote(new RationalNum(1, 1), new Pitch('C').transpose(13));
        List<Music> notes = Arrays.asList(noteC, noteC, noteC, noteC);
        Music tuplet = new Tuplet(notes);
        SequencePlayer player = new SequencePlayer(140, 1);
        tuplet.play(player, 0, 3);
        assertEquals("Event: NOTE_ON  Pitch: 73  Tick: 0\n" 
                + "Event: NOTE_OFF Pitch: 73  Tick: 3\n"
                + "Event: NOTE_ON  Pitch: 73  Tick: 3\n" 
                + "Event: NOTE_OFF Pitch: 73  Tick: 6\n"
                + "Event: NOTE_ON  Pitch: 73  Tick: 6\n" 
                + "Event: NOTE_OFF Pitch: 73  Tick: 9\n"
                + "Event: NOTE_ON  Pitch: 73  Tick: 9\n" 
                + "Event: NOTE_OFF Pitch: 73  Tick: 12\n"
                + "Meta event: END_OF_TRACK Tick: 12\n", player.toString());
    }
    @Test //notes.size() = 3, all different octaves, some flat, play atTick > 0
    public void testTupletPlayDifferentOctaves() throws MidiUnavailableException, InvalidMidiDataException {
        Music lowA = new SingleNote(new RationalNum(1, 1), new Pitch('A').transpose(-13));
        Music midA = new SingleNote(new RationalNum(1, 1), new Pitch('A').transpose(-2));
        Music highB = new SingleNote(new RationalNum(1, 1), new Pitch('B'));
        List<Music> notes = Arrays.asList(lowA, midA, highB);
        Music tuplet = new Tuplet(notes);
        SequencePlayer player = new SequencePlayer(140, 1);
        tuplet.play(player, 2, 1);
        assertEquals("Event: NOTE_ON  Pitch: 56  Tick: 2\n" 
                + "Event: NOTE_OFF Pitch: 56  Tick: 3\n"
                + "Event: NOTE_ON  Pitch: 67  Tick: 3\n" 
                + "Event: NOTE_OFF Pitch: 67  Tick: 4\n"
                + "Event: NOTE_ON  Pitch: 71  Tick: 4\n" 
                + "Event: NOTE_OFF Pitch: 71  Tick: 5\n"
                + "Meta event: END_OF_TRACK Tick: 5\n", player.toString());
    }
    
}
