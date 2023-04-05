class TwoGenerics<T>
{
T a;
T b;
TwoGenerics(T a1,T b1){
a=a1;
b=b1;
}
void swap()
{
T c=a;
a=b;
b=c;
}
void print()
{
System.out.println(a);
System.out.println(b);
}
}
class demo
{
public static void main(String args[])
{
TwoGenerics<String>obj=new TwoGenerics<String>("Hari","s");
System.out.println("Before Swapping");
obj.print();
System.out.println("After Swapping");
obj.swap();
obj.print();
TwoGenerics<Double>obj1=new TwoGenerics<Double>(18.6,15.3);
System.out.println("Before Swapping");
obj1.print();
System.out.println("After Swapping");
obj1.swap();
obj1.print();
}
}

