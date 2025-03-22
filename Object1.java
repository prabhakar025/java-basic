class Prabhakar
{
int x; //instance(object) member variable
int y; //instance(object) member variable

void fun1() //instance(object) member variable
{
System.out.println("fun1");
}
void fun2() //instance(object) member variable
{
System.out.println("fun2");
}
}
class Oject1
{
public static void main(String []args)
{
Prabhakar p1=new Prabhakar();
Prabhakar p2=new Prabhakar();
p1.x=5;
p2.x=15;
System.out.println("hello");
System.out.println(p2.x);
}
}