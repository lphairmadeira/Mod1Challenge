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
Scanner g = new Scanner(System.in);
System.out.println("Enter your favorite genre");
String genre = s.nextLine();
    if (genre == "Pop")
        System.out.println("Same");

    else if (genre != "Pop")
        System.out.println("Lame");

//Challenge Problem 3
Scanner m = new Scanner(System.in);
for (int i =0; i <10; i++);{
int number = 4;
System.out.println("Please enter a number");
int guess = s.nextInt();
    if (guess == number){
    System.out.println("Congrats! You guessed my number");}

    else if (guess != number){
    System.out.println("Not my number! Try again.");}}

//Challenge Problem 4
       /* int outerCounter = 5;
                while (outerCounter > 0);
                int innerCounter = 0;
                    while ("comapare inner to outer");
        System.out.println('*'); */
    }}
