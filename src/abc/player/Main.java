package abc.player;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import abc.sound.SequencePlayer;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     * @throws IOException 
     * @throws InvalidMidiDataException 
     * @throws MidiUnavailableException 
     */
    public static void play(String file) throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File musicFile = new File(file);
        SequencePlayer player = Music.parse(musicFile);
        player.play();
    }

    public static void main(String[] args) {
        try {
            List<Object> arguments = Arrays.asList(args);
            String file = (String) arguments.get(0);
            play(file);
        } catch (IOException ioe) {
            System.err.println("Invalid File");
        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            System.err.println("Sequence Player not working");
        } catch (IndexOutOfBoundsException e) {
            throw new Error("Must have an file argument --*filename*");
        }
        
    }
}
