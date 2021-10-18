# Java
Calculator by using Method Overloading
import java.util.Scanner;
// Calculator by using Method Overloading
public class Test4 {
void arithmetic (int a , int b)
{
System.out.println("Addition :-");	
System.out.println(a+b);
}
void arithmetic (int c , long d)
{
System.out.println("Subtraction :-");	
System.out.println(c-d);
}
void arithmetic (long e , int f)
{
System.out.println("Multiplication :-");	
System.out.println(e*f);
}
void arithmetic (long g , long h)
{
System.out.println("Division :-");	
System.out.println(g/h);
}
public static void main(String[] args) {
	Test4 t = new Test4();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Number for perticular application ");
	System.out.println("1 For Addition");
	System.out.println("2 For Subtraction");
	System.out.println("3 For Multiplication");
	System.out.println("4 For Divison");
	int s1 = s.nextInt();
	
		
if ( s1==1)
{
	System.out.println("Enter Number");
	int o1 = s.nextInt();
	int o2 = s.nextInt();
	t.arithmetic(o1, o2);
}
else if (s1==2)
{
	System.out.println("Enter Number");
	int o1 = s.nextInt();
	long o2 = s.nextLong();
t.arithmetic(o1, o2);	
}
else if (s1==3)
{
	System.out.println("Enter Number");
	long o1 = s.nextLong();
	int o2 = s.nextInt();
t.arithmetic(o1, o2);	
}
else if (s1==4)
{
	System.out.println("Enter Number");
	long o1 = s.nextLong();
	 long o2 = s.nextLong();
t.arithmetic(o1, o2);	
}
else
{
System.out.println("Invalid entry");	
}
}
}
