import java.io.*;
import java.util.*;
class R192011452
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the 1st number");
        a=sc.nextInt();
        System.out.println("Enter the 2nd number");
        b=sc.nextInt();
        System.out.println("Enter the number to skip");
        c=sc.nextInt();
        for(int i=a;i<=b;i=i+c)
        {
            System.out.println(i);
        }
    }

}