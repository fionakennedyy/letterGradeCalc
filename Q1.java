import java.util.Scanner;
public class Q1{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		int a = 0, b = 0, c = 0, d = 0, f = 0;
		int count = 0;
		System.out.println("Enter grades 0-100. Enter 200 to stop.");
		while(int grade = kb.nextInt() <= 100)
		{
			count++;
			if((grade <= 100) && (grade >= 90))
			{
				a++;
			}
			else if(grade >= 80)
			{
				b++;
			}
			else if(grade >= 70)
			{
				c++;
			}
			else if(grade >= 60)
			{
				d++;
			}
			else if(grade >= 0)
			{
				f++;
			}
		}
		System.out.println("Total number of grades: " + count);
		System.out.println("Number of A's: " + a);
		System.out.println("Number of B's: " + b);
		System.out.println("Number of C's: " + c);
		System.out.println("Number of D's: " + d);
		System.out.println("Number of F's: " + f);
	}
}