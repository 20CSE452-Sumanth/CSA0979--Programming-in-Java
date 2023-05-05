import java.util.*;
import java.io.*;
class palindrome
{
public static void main(String[] args)
{
Scanner e=new Scanner(System.in);
String ip=e.nextLine();
String r="";
for(int i=ip.length()-1;i>=0;i--)
{
r=r+ip.charAt(i);
}

if(ip.equals(r))
{
System.out.println("Palindrome!!!");
}
else
System.out.println("Not a Palindrome");
}
}