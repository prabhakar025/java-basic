import java.util.*;
public class checkincometax 
{
public static void main(String[]args)
{int Tax;
Scanner sc=new Scanner(System.in);
int income=sc.nextInt();
if(income<500000)
{
Tax=0;
}
else if(income>= 500000 && income <  1000000)
{
Tax=(int)(income * 0.2); 
}
else
{
Tax=(int) (income * 0.3);
System.out.println("your tax is:" +Tax);
}
}
}