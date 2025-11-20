package Workshop3;
import java.util.Scanner;

/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
public static void main(String[]arg)
{
   int grade;
   Scanner sc= new Scanner(System.in);
   System.out.println("Please enter your grade;");
   grade = sc.nextInt();
   System.out.println(grade<=40 ?"Fail":"Pass");
}
}