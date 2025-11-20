import java.util.Scanner;
/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
    public static void main(String[]arg)
    {
    int FirstNumber;
    int SecondNumber;
    int Sum;
    int Substraction;
    int Division;
    int Multiplication;
    int Remainder;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First number:");
    FirstNumber = sc.nextInt();
    System.out.println("Enter Second number:");
    SecondNumber = sc.nextInt();
    Sum = FirstNumber + SecondNumber;
    Substraction = FirstNumber - SecondNumber;
    Division = FirstNumber / SecondNumber;
    Multiplication = FirstNumber * SecondNumber;
    Remainder = FirstNumber % SecondNumber;
    System.out.println("Sum:"+Sum);
    System.out.println("Substraction:"+Substraction);
    System.out.println("Division:"+Division);
    System.out.println("Multiplication:"+Multiplication);
    System.out.println("Remainder:"+Remainder);
    System.out.println(FirstNumber > SecondNumber ? "The Greater Number is:"+FirstNumber : "The Greater Number is:"+SecondNumber);
    }
}