module xyz {
}public class DoWhileTest  
{ 
public static void main(String args[]) 
{ 
int i = 20; 
do 
{ 
System.out.println(i); 
i = i+1; 
} while (i <= 20); 

System.out.println(i);
} 
}

For loop program
import java.util.Scanner;
public class ForLoopDemo {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the range ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		for (int i = m; i <= n; i++) 
		{
			if(i%2==0)
			{
			System.out.println("Multiplication table of "+i);
			for(int j=1;j<=10;j++)
			{
			System.out.println(i + "*" + j + "=" + (i * j));
		}
			}	
	}
}
}
public class WhileTest { 
	public static void main(String args[]) { 
		int i = 5; 
		while (i <= 15) {
			System.out.println(i); i = i+2; 
			} 
		}
	}