package Java_Examples;

import java.util.Scanner;

public class Test1 {
void m1()
{
System.out.println("Invalid Entry");	
}
	public static void main(String[] args) {
	System.out.println("1 for Addition");
	System.out.println("2 for Substraction");
	System.out.println("3 for Multiplication");
	System.out.println("4 for Division");
Scanner s = new Scanner(System.in);
int a = s.nextInt();
Div t = new Div();

if(a==1)
{
	t.m1();
	
}
else if (a==2)
{
t.m2();	
}
else if (a==3)
{
t.m3();	
}else if(a==4)
{
t.m4();	
}else
{
new Test1().m1();	
}
}
}
