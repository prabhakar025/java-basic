import java.util.Scanner;
class Userinput1
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
String name=s.next();
System.out.println("enter your age");
int age=s.nextInt();
System.out.println("enter your gender");
char gender=s.next().charAt(0);
System.out.println("enter your phone number");
long phone=s.nextLong();
System.out.println("______");
System.out.println("Name:" +name);
System.out.println("Age:"+age);
System.out.println("Gender:"+gender);
System.out.println("phone no:"+phone);
}
}
