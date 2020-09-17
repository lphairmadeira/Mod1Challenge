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
    if (number1 > number2)
        System.out.println("First");
    else
        System.out.println("Second");

//Challenge Problem 2
Scanner g = new Scanner(System.in);
System.out.println("Enter your favorite genre");
String genre = s.nextLine();
    if (genre == "Pop")
        System.out.println("Same");
    else
        System.out.println("Lame");

//Challenge Problem 3
      int number = 4;
        Scanner m = new Scanner(System.in);
        System.out.println("Guess the number 1-10");
        int guess = s.nextInt();
        if (guess == number);
        System.out.println("Congrats! You guessed my number");

    }}
