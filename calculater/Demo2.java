class A
{

A()
{

System.out.println("welcome constuctors");

}

}

class Demo2
{
static A a[]=new A[9];
public static void main(String ar[])
{
for(int i=0;i<5;i++)
{

a[i]=new A();

}


}


}