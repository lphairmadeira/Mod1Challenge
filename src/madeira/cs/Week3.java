package madeira.cs;
import java.util.Scanner;
public class Week3 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);


/*

	Lindsay - 
	It seems you're struggling a bit with the syntax of for / while loops. 
	Please see me if you want a bit more review 1:1!
*/
//Challenge Problem 1
System.out.println("Enter one number");
double number1 = s.nextDouble();
System.out.println("Enter a second number");
double number2 = s.nextDouble();
if (number1 > number2){
System.out.println("First");}
else if (number2 > number1) {
System.out.println("Second");}

//Challenge Problem 2
System.out.println("Enter your favorite genre");
String genre = s.nextLine();
if (genre == "Pop"){
System.out.println("Same");}
else if (false);{
    System.out.println("Lame");}

//Challenge Problem 3
int number = 4;
System.out.println("Please enter a number");
int guess = s.nextInt();
int count = 0;
/*
	This loop doesn't actually allow the user to keep guessing 
	you need to put your s.nextInt() inside the loop
*/
for (count = 0; count <10; count ++) { // this semicolon needn't be there

	// important to keep your spacing correct
	// if something is inside the loop - space it accordingly 
    // i.e. hit tab so that it's clear what's inside what
	if (guess == number){
		System.out.println("Congrats! You guessed my number");
	}
	// this can also be a plain else
	else if (guess != number); {
		System.out.println("Not my number! Try again.");
	}
}

//Challenge Problem 4
int outerCounter = 5;
while (outerCounter > 0);
int innerCounter = 0;
while (outerCounter < innerCounter); // this won't loop either ... no semi colon needed
System.out.println('*'); 

//Challenge Problem 5
int count1 = 4;
while (count1 > 0)
{ System.out.println("*");
count1 = count1 / 2; }

}}

