package week3;

/**
 * Write a description of class datatypesexample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class datatypesexample
{
    public static void main(String[]arg)
    {
    System.out.println(Float.MAX_VALUE+"\t"+Float.MIN_VALUE+"\t"+Float.BYTES+"\t"+Float.SIZE);
    System.out.println("My name is \"Saroj\"");
    byte b=12;
    byte d=13;
    byte e=(byte)(b+d);
    float f=233.3f;
    long l=200l;
    int a=20;
    float g=2.33f;
    double h=2.334;
    int x =(int)(a+g+h);
    System.out.println(x);
    char c='A';
    System.out.println((int)c); // to find aski value
    int i=50;
    System.out.println((char)i);
    int length=10;
    int breadth=20;
    int area=length*breadth;
    int perimeter=(2*length)+(2*breadth);
    System.out.println("Area;"+area);
    System.out.println("Perimeter;"+perimeter);
    int principle=5000;
    int time=2;
    float rate=2.4f;
    int SI=(int)((principle*time*rate)/100);
    int Amount=(int)((principle*(1+(rate/1))Math.pow(1*time));
    int CI=(int)(Amount-principle);
    }
}