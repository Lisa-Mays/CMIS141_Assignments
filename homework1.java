/*
* File: Homework1.java
*Author: Lisa Mays
*Date: November 3, 2020
*Purpose: This program performs grade calculations for a specific 
id along with temperature and age calculations.
*/

// Import Java Classes
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// Variables
		int studentId = 0;
		double quizOne = 0;
		double quizTwo = 0;
		double quizThree = 0;
		double avgQuizGrade = 0;
		int ageInMonths = 0;
		double ageInYears = 0;
		double tempInCelsius = 0;
		double tempInFahrenheit = 0;
		
		// Initialize the scanner
		Scanner scannerIn = new Scanner(System.in);
		
		// Prompt for a student ID EMPLID
		System.out.print("Please enter your student EMPLID: ");
		studentId = scannerIn.nextInt();

		// Prompt for Quiz1
		System.out.print("Please enter your grade for Quiz1: ");
		quizOne = scannerIn.nextDouble();
		 
		// Prompt for Quiz2
		System.out.print("Please enter your grade for Quiz2: ");
		quizTwo = scannerIn.nextDouble();
				
		// Prompt for Quiz 3
		System.out.print("Please enter your grade for Quiz3: ");
		quizThree = scannerIn.nextDouble();
		
		// Prompt for age in months
		System.out.print("Please enter your age in months: ");
		ageInMonths = scannerIn.nextInt();
		
		//Prompt for temperature in Celsius
		System.out.print("Please enter the current temperature in Celsius: ");
		tempInCelsius = scannerIn.nextDouble();
		
		// Calculate average quiz score
		avgQuizGrade = (quizOne + quizTwo + quizThree) / 3.0;
		
		// Calculate age in years
		ageInYears = ageInMonths / 12.0;
		
		// Calculate temperature in Fahrenheit
		tempInFahrenheit = tempInCelsius / 5.0 * 9.0 + 32;
		
		// Output Student ID, quiz scores, average quiz score, age in months, age in years, temp in celsius, temp in fahrenheit
		System.out.println("***Thank you***Student");
		System.out.println("EMPLID: " + studentId);
		System.out.println("Quiz 1 Score: " + quizOne);
		System.out.println("Quiz 2 Score: " + quizTwo);
		System.out.println("Quiz 3 Score: " + quizThree);
		System.out.printf("Average quiz score: %.1f \n" , avgQuizGrade);
		System.out.println("Age in months: " + ageInMonths);
		System.out.printf("Age in years: %.1f \n" , ageInYears);
		System.out.println("Temperature in Celsius: " + tempInCelsius + "\u00B0");
		System.out.printf("Temperature in Fahrenheit: %.1f\u00B0 \n" , tempInFahrenheit);
	}
}
