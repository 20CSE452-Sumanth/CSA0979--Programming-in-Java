import java.util.*;
import java.io.*;
class leap
{
public static void main(String[] args)
{
Scanner e=new Scanner(System.in);
int y=e.nextInt();
if((y%4==0 && y%100!=0) || (y%100==0))
{
System.out.println("Leap year");
}
else 
System.out.println("Not a leap year");
}
}