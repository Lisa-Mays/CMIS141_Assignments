import java.awt.Color;

// Required import for using the Random class; needed for generating random notes.
import java.util.Random;

public class Guitar {
	// Guitar properties
	private int numStrings;
	private double guitarLength;
	private String guitarManufacturer;
	private Color guitarColor;
	private static final int NOTES_TO_PLAY = 16;
	private Random random = new Random();
	
	// Default constructor.
	public Guitar() {
		numStrings = 6;
		guitarLength = 28.2;
		guitarManufacturer = "Gibson";
		guitarColor = Color.red;
	}
	
	// Custom constructor that accepts the number of strings, length, manufacturer, and color.
	public Guitar(int newGuitarStrings, double newGuitarLength, String newGuitarManufacturer, Color newGuitarColor) {
		numStrings = newGuitarStrings;
		guitarLength = newGuitarLength;
		guitarManufacturer = newGuitarManufacturer;
		guitarColor = newGuitarColor;
	}
	
	// Gets the number of strings on the guitar.
	public int getNumStrings() {
		return numStrings;
	}
	
	// Gets the length of the guitar.
	public double getGuitarLength() {
		return guitarLength;
	}
	
	// Gets the manufacturer of the guitar.
	public String getGuitarManufacturer() {
		return guitarManufacturer;
	}
	
	// Gets the color of the guitar (as a String).
	public String getGuitarColor() {
		// Is the guitar red?
		if (guitarColor == Color.red) {
			return "Red";
		}
		// Is the guitar black?
		if (guitarColor == Color.black) {
			return "Black";
		}
		// Is the guitar blue?
		if (guitarColor == Color.blue) {
			return "Blue";
		}
		// Is the guitar green?
		if (guitarColor == Color.green) {
			return "Green";
		}

		// Guitar is a color we haven't seen before; return the Java representation of the color.
		return guitarColor.toString();
	}
	
	// Play 16 notes on the guitar.
	public String playGuitar() {
		String guitarNotes = "";

		// Only play the guitar if the constant 'NOTES_TO_PLAY' is at least 1.
		if (NOTES_TO_PLAY >= 1) {
			// Play the first note and assign it to the guitarNotes variable.
			guitarNotes += getRandomNote();
			// PLay the remaining notes (probably 2 through 16).
			for(int note = 1; note < NOTES_TO_PLAY; note++) {
				// Get a note, and append it to the guitarNotes variable.
				guitarNotes += ", " + getRandomNote();
			}
		}
		// Add square brackets around the list of notes, and return.
		return "[" + guitarNotes + "]";
	}
	
	// Gets a random note (tone and duration).
	private String getRandomNote() {
		// The tone is a random letter from A to G.
		// Generate a number from 0 to 6, then add it to the character 'A'.
		char noteTone = (char)(random.nextInt(7) + 'A');
		
		// The duration is one of five different values.
		String noteDuration = "";
		
		// Generate a random number from 0 to 4, then get the duration based on that.
		switch(random.nextInt(5)) {
			case 0:
				noteDuration = "0.25";
				break;
			case 1:
				noteDuration = "0.5";
				break;
			case 2:
				noteDuration = "1";
				break;
			case 3:
				noteDuration = "2";
				break;
			case 4:
				noteDuration = "4";
				break;
		}
		
		// A note is a letter, open-parentheses, duration, and closed-parentheses.
		return noteTone + "(" + noteDuration + ")";
	}
	
	// Returns the string representation of the guitar.
	public String toString() {
		return "("
				+ "numStrings=" + getNumStrings()
				+ ", Length=" + getGuitarLength()
				+ ", manufacturer=" + getGuitarManufacturer()
				+ ", color=" + getGuitarColor()
				+ ")";
	}
}
