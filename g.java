import java.io.*;
import java.util.*;

class great {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter 1st number");
        a = sc.nextInt();
        System.out.println("Enter 2nd number");
        b = sc.nextInt();
        if (a > b)
            System.out.println(a + " is greater");
        else
            System.out.println(b + " is greater");
    }
}
