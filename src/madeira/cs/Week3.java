package madeira.cs;
import java.util.Scanner;
public class Week3 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);

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
for (count = 0; count <10; count ++);{
if (guess == number){
System.out.println("Congrats! You guessed my number");}
else if (guess != number); {
System.out.println("Not my number! Try again.");}}

//Challenge Problem 4
int outerCounter = 5;
while (outerCounter > 0);
int innerCounter = 0;
while (outerCounter < innerCounter);
System.out.println('*');

//Challenge Problem 5
int count1 = 4;
while (count1 > 0)
{ System.out.println("*");
count1 = count1 / 2; }

}}

