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
    
    @Test //notes have duration 1 at tick 0, middle octave, natural
    public void testChordPlayDurationOne() 
            throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteA = new SingleNote(1, new Pitch('A'));
        SingleNote noteB = new SingleNote(1, new Pitch('B'));
        Music chord = new Chord(Arrays.asList(noteA, noteB));
        SequencePlayer player = new SequencePlayer(100, 5);
        chord.play(player, 0);
        assertEquals("Event: NOTE_ON  Pitch: 69  Tick: 0\n" 
                    + "Event: NOTE_ON  Pitch: 71  Tick: 0\n"
                    + "Event: NOTE_OFF Pitch: 69  Tick: 1\n"
                    + "Event: NOTE_OFF Pitch: 71  Tick: 1\n"
                    + "Meta event: END_OF_TRACK Tick: 1\n", player.toString());
    }
    @Test //notes have same of durations >1, plays atTick >0
    public void testChordPlayDurationGreaterThanOne() 
            throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteA = new SingleNote(10, new Pitch('A'));
        SingleNote noteC = new SingleNote(10, new Pitch('C'));
        Music chord = new Chord(Arrays.asList(noteA, noteC));
        SequencePlayer player = new SequencePlayer(100, 5);
        chord.play(player, 5);
        assertEquals("Event: NOTE_ON  Pitch: 69  Tick: 5\n" 
                    + "Event: NOTE_ON  Pitch: 60  Tick: 5\n"
                    + "Event: NOTE_OFF Pitch: 69  Tick: 15\n"
                    + "Event: NOTE_OFF Pitch: 60  Tick: 15\n"
                    + "Meta event: END_OF_TRACK Tick: 15\n", player.toString());
    }
    @Test //notes have different durations >1
    public void testChordDifferentNoteDurations()  
            throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteA = new SingleNote(10, new Pitch('A'));
        SingleNote noteC = new SingleNote(5, new Pitch('C'));
        Music chord = new Chord(Arrays.asList(noteA, noteC));
        SequencePlayer player = new SequencePlayer(100, 5);
        chord.play(player, 5);
        assertEquals("Event: NOTE_ON  Pitch: 69  Tick: 5\n" 
                    + "Event: NOTE_ON  Pitch: 60  Tick: 5\n"
                    + "Event: NOTE_OFF Pitch: 60  Tick: 10\n"
                    + "Event: NOTE_OFF Pitch: 69  Tick: 15\n"
                    + "Meta event: END_OF_TRACK Tick: 15\n", player.toString());
    }
    @Test //both notes are lower octave, natural (A,)
    public void testChordPlayLowerOctave() 
            throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteA = new SingleNote(10, new Pitch('A').transpose(-12));
        SingleNote noteB = new SingleNote(10, new Pitch('B').transpose(-12));
        Music chord = new Chord(Arrays.asList(noteA, noteB));
        SequencePlayer player = new SequencePlayer(100, 5);
        chord.play(player, 0);
        assertEquals("Event: NOTE_ON  Pitch: 57  Tick: 0\n"
                    + "Event: NOTE_ON  Pitch: 59  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 57  Tick: 10\n"
                    + "Event: NOTE_OFF Pitch: 59  Tick: 10\n"
                    + "Meta event: END_OF_TRACK Tick: 10\n", player.toString());
    }
    @Test //both notes are higher octave, natural (B' and D')
    public void testChordPlayHigherOctave() throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteB = new SingleNote(10, new Pitch('B').transpose(12));
        SingleNote noteD = new SingleNote(10, new Pitch('D').transpose(12));
        Music chord = new Chord(Arrays.asList(noteB, noteD));
        SequencePlayer player = new SequencePlayer(100, 5);
        chord.play(player, 0);
        assertEquals("Event: NOTE_ON  Pitch: 83  Tick: 0\n" 
                    + "Event: NOTE_ON  Pitch: 74  Tick: 0\n"
                    + "Event: NOTE_OFF Pitch: 83  Tick: 10\n"
                    + "Event: NOTE_OFF Pitch: 74  Tick: 10\n"
                    + "Meta event: END_OF_TRACK Tick: 10\n", player.toString());
    }
    @Test //notes are sharp
    public void testChordPlayFlatAndSharp() throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteC = new SingleNote(10, new Pitch('C').transpose(1));
        SingleNote noteF = new SingleNote(10, new Pitch('F').transpose(1));
        Music chord = new Chord(Arrays.asList(noteC, noteF));
        SequencePlayer player = new SequencePlayer(100, 5);
        chord.play(player, 0);
        assertEquals("Event: NOTE_ON  Pitch: 61  Tick: 0\n" 
                    + "Event: NOTE_ON  Pitch: 66  Tick: 0\n"
                    + "Event: NOTE_OFF Pitch: 61  Tick: 10\n"
                    + "Event: NOTE_OFF Pitch: 66  Tick: 10\n"
                    + "Meta event: END_OF_TRACK Tick: 10\n", player.toString());
    }
    @Test //# of notes >2
    public void testChordPlayThreeNotes() throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote noteC = new SingleNote(30, new Pitch('C').transpose(-1));
        SingleNote noteA = new SingleNote(20, new Pitch('A'));
        SingleNote noteE = new SingleNote(15, new Pitch('E'));
        Music chord = new Chord(Arrays.asList(noteC, noteA, noteE));
        SequencePlayer player = new SequencePlayer(100, 5);
        chord.play(player, 0);
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
     //2 Rests/2 SingleNotes/2 Chords/2 Layers/2 Concats
     //combinations of the above
    
    @Test
    public void testConcatPlayTwoRests() throws MidiUnavailableException, InvalidMidiDataException {
        Music rest1 = new Rest(1);
        Music rest2 = new Rest(2);
        Music concat = new Concat(rest1, rest2);
        SequencePlayer player = new SequencePlayer(100, 1);
        concat.play(player, 0);
        assertEquals("Meta event: END_OF_TRACK Tick: 0\n", player.toString());
    }
    @Test //play Concat(Rest, SingleNote)
    public void testConcatPlayRestSingleNote() throws MidiUnavailableException, InvalidMidiDataException {
        Music rest = new Rest(1);
        Music note = new SingleNote(2, new Pitch('C'));
        Music concat = new Concat(rest, note);
        SequencePlayer player = new SequencePlayer(100, 1);
        concat.play(player, 0);
        assertEquals("Event: NOTE_ON  Pitch: 60  Tick: 1\n" 
                    + "Event: NOTE_OFF Pitch: 60  Tick: 3\n"
                    + "Meta event: END_OF_TRACK Tick: 3\n", player.toString());
    }
    @Test //play Concat(SingleNote, Rest)
    public void testConcatPlaySingleNoteRest() throws MidiUnavailableException, InvalidMidiDataException {
        Music rest = new Rest(1);
        Music note = new SingleNote(2, new Pitch('C'));
        Music concat = new Concat(note, rest);
        SequencePlayer player = new SequencePlayer(100, 1);
        concat.play(player, 0);
        assertEquals("Event: NOTE_ON  Pitch: 60  Tick: 0\n" 
                    + "Event: NOTE_OFF Pitch: 60  Tick: 2\n"
                    + "Meta event: END_OF_TRACK Tick: 2\n", player.toString());
    }
    @Test //play Concat(SingleNote, SingleNote)
    public void testConcatPlayTwoSingleNotes() throws MidiUnavailableException, InvalidMidiDataException {
        Music note1 = new SingleNote(5, new Pitch('C'));
        Music note2 = new SingleNote(5, new Pitch('D'));
        Music concat = new Concat(note1, note2);
        SequencePlayer player = new SequencePlayer(100, 1);
        concat.play(player, 0);
        assertEquals("Event: NOTE_ON  Pitch: 60  Tick: 0\n"
                    + "Event: NOTE_OFF Pitch: 60  Tick: 5\n"
                    + "Event: NOTE_ON  Pitch: 62  Tick: 5\n"
                    + "Event: NOTE_OFF Pitch: 62  Tick: 10\n"
                    + "Meta event: END_OF_TRACK Tick: 10\n", player.toString());
    }
    @Test //play Concat(Chord, Chord)
    public void testConcatPlayTwoChords() throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote note1 = new SingleNote(5, new Pitch('C'));
        SingleNote note2 = new SingleNote(5, new Pitch('D'));
        Music chord1 = new Chord(Arrays.asList(note1, note2));
        Music chord2 = new Chord(Arrays.asList(note2, note1));
        Music concat = new Concat(chord1, chord2);
        SequencePlayer player = new SequencePlayer(100, 1);
        concat.play(player, 0);
        assertEquals("Event: NOTE_ON  Pitch: 60  Tick: 0\n"
                    + "Event: NOTE_ON  Pitch: 62  Tick: 0\n"
                    + "Event: NOTE_OFF Pitch: 60  Tick: 5\n"
                    + "Event: NOTE_OFF Pitch: 62  Tick: 5\n"
                    + "Event: NOTE_ON  Pitch: 62  Tick: 5\n"
                    + "Event: NOTE_ON  Pitch: 60  Tick: 5\n"
                    + "Event: NOTE_OFF Pitch: 62  Tick: 10\n"
                    + "Event: NOTE_OFF Pitch: 60  Tick: 10\n"
                    + "Meta event: END_OF_TRACK Tick: 10\n", player.toString());
    }
    @Test //play Concat(Concat, Concat)
    public void testPlayFourConsecutiveNotes() throws MidiUnavailableException, InvalidMidiDataException {
        SingleNote note1 = new SingleNote(5, new Pitch('C'));
        SingleNote note2 = new SingleNote(5, new Pitch('D'));
        Music chord = new Chord(Arrays.asList(note1, note2));
        Music note3 = new SingleNote(4, new Pitch('F').transpose(1));
        Music concat1 = new Concat(note3, note3);
        Music concat2 = new Concat(chord, note3);
        Music music = new Concat(concat1, concat2);
        SequencePlayer player = new SequencePlayer(100, 1);
        music.play(player, 0);
        assertEquals("Event: NOTE_ON  Pitch: 66  Tick: 0\n"
                    + "Event: NOTE_OFF Pitch: 66  Tick: 4\n"
                    + "Event: NOTE_ON  Pitch: 66  Tick: 4\n"
                    + "Event: NOTE_OFF Pitch: 66  Tick: 8\n"
                    + "Event: NOTE_ON  Pitch: 60  Tick: 8\n"
                    + "Event: NOTE_ON  Pitch: 62  Tick: 8\n"
                    + "Event: NOTE_OFF Pitch: 60  Tick: 13\n"
                    + "Event: NOTE_OFF Pitch: 62  Tick: 13\n"
                    + "Event: NOTE_ON  Pitch: 66  Tick: 13\n"
                    + "Event: NOTE_OFF Pitch: 66  Tick: 17\n"
                    + "Meta event: END_OF_TRACK Tick: 17\n", player.toString());
    }
    
    //Layer.play()
}
