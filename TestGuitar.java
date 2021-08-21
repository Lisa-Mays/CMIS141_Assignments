import java.awt.Color;

public class TestGuitar {
	 public static void main (String[] args) {
		 // Create a default guitar.
		 Guitar defaultGuitar = new Guitar();
		 
		 // Test the default guitar.
		 RunGuitarTest(defaultGuitar);
		 
		 // Create a 12-string acoustic guitar.
		 Guitar acousticGuitar = new Guitar(12, 25.3, "Takamine", Color.black);
		 
		 // Test the acoustic guitar.
		 RunGuitarTest(acousticGuitar);
		 
		 // Create a 4-string bass guitar.
		 Guitar bassGuitar = new Guitar(4, 34.1, "Ibanez", Color.blue);
		 
		 // Test the bass guitar.
		 RunGuitarTest(bassGuitar);
	 }
	 
	 private static void RunGuitarTest(Guitar guitar) {
		 System.out.println("toString(): " + guitar.toString());
		 System.out.println("getNumStrings(): " + guitar.getNumStrings());
		 System.out.println("getGuitarLength(): " + guitar.getGuitarLength());
		 System.out.println("getGuitarManufacturer(): " + guitar.getGuitarManufacturer());
		 System.out.println("getGuitarColor(): " + guitar.getGuitarColor());
		 System.out.println("playGuitar(): " + guitar.playGuitar());
		 System.out.println("");
	 }
}
