import java.io.*;
import java.util.*;

class vowel {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        char s = sc.next().charAt(0);
        switch (s) {
            case 'a':
                System.out.println("Its a Vowel !!!!");
                break;
            case 'A':
                System.out.println("Its a Vowel !!!!");
                break;
            case 'E':
                System.out.println("Its a Vowel !!!!");
                break;
            case 'I':
                System.out.println("Its a Vowel !!!!");
                break;
            case 'O':
                System.out.println("Its a Vowel !!!!");
                break;
            case 'U':
                System.out.println("Its a Vowel !!!!");
                break;

            case 'e':
                System.out.println("Its a Vowel !!!!");
                break;
            case 'i':
                System.out.println("Its a Vowel !!!!");
                break;
            case 'o':
                System.out.println("Its a Vowel !!!!");
                break;
            case 'u':
                System.out.println("Its a Vowel !!!!");
                break;
            default:
                System.out.println("Its a consonant");

        }
    }
}