import java.io.*;
import java.util.*;

class great {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a, b,c;
        System.out.println("Enter 1st number");
        a = sc.nextInt();
        System.out.println("Enter 2nd number");
        b = sc.nextInt();
System.out.println("Enter 3rd number");
c=sc.nextInt();
        if (a>b && b>c)
            System.out.println(a + " is greater");
        else if(b>c && b>a)
            System.out.println(b + " is greater");
else 
System.out.println(c+" is greater");
    }
}
