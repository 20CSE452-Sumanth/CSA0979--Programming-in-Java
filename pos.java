import java.util.*;
import java.io.*;
class pos
{

public static void main(String[] args)
{
float nc=0,pc=0,ns=0,ps=0;
Scanner e= new Scanner(System.in);
int a[]=new int[30];
int i=0;
a[i]=e.nextInt();
while(a[i]!=-1)
{
++i;
a[i]=e.nextInt();
}
for(int j=0;j<a.length;j++)
{
if(a[j]<0)
{
nc++;
ns+=a[j];
}
if(a[j]>0)
{
pc++;
ps+=a[j];
}
}
float na=ns/nc;
float pa=ps/pc;
System.out.println("The average of negative numbers "+na);
System.out.println("The average of positive numbers "+pa);
}
}