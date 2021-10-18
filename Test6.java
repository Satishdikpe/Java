import java.util.Scanner;

public class Test6 {
Test6(int a,int b,int c)
{
 c = a+b;
System.out.println(c);
}
Test6(int a,int b)
{
int z = a-b;
System.out.println(z);
}
Test6(int a,int b,String s )
{
int x = a*b;
s = "Satish";
System.out.println(x);
}
Test6(int a, int b,int m,int n)
{
m = a/b;
System.out.println(m);
}

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Number for perticular application ");
	System.out.println("1 For Addition");
	System.out.println("2 For Subtraction");
	System.out.println("3 For Multiplication");
	System.out.println("4 For Divison");
	int s1 = s.nextInt();
	System.out.println("Enter Numbers :- ");
	int s2 = s.nextInt();
	int s3 = s.nextInt();
if (s1==1)
{
new Test6(s2, s3, 0);
}
else if (s1==2)
{
new Test6(s2, s3);	
}
else if(s1==3)
{
new Test6(s2, s3, "Multiplication");	
}
else if (s1==4)
{
new Test6(s2, s3, 20, 20);	
}
else
{
System.out.println("Invalid Entry");	
}
}
}

