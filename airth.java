import java.util.Scanner;
class airth
{
public static void main(String[] args)
{
int a,b;
System.out.print("enter two number");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
b=obj.nextInt();
System.out.println("Addition"+(a+b));
System.out.println("Subtracttion"+(a-b));
System.out.println("Multiplication"+(a*b));
System.out.println("Division"+(a/b));
System.out.println("Remainder"+(a%b));
}
}