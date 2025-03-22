class Typevariable
{
static int b=20;//Static variable
int c=30;// Instance
public static void main(String[] args)
{
int a=10;//Local
System.out.println(a);
System.out.println(Typevariable.b);
Typevariable T=new Typevariable();
System.out.println(T.c);
}
}