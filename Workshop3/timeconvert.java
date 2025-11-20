package Workshop3;
import java.util.Scanner;

/**
 * Write a description of class timeconvert here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class timeconvert
{
    public static void main(String[]arg)
    {
        int seconds;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter time in seconds");
        seconds= sc.nextInt();
        int day=seconds/(60*60*24);
        int remday=seconds%(60*60*24);
        int hour=remday/(60*60);
        int remhour=remday%(60*60);
        int minute=remhour/60;
        int remminute=remhour%60;
        System.out.println("Days:"+day+"\n"+"Hours"+hour+"\n"+"Minutes:"+minute+"\n"+"Seconds:"+remminute);   
    }
    
}