package Java_Examples;

import java.util.Scanner;

public class sub extends Add {
void m2()
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Your number");	
	int a = s.nextInt();
	int b = s.nextInt();
	System.out.println(a-b);	
}
}
