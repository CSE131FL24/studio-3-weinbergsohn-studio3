package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Find prime numbers up to: ");
		int n = in.nextInt();
		
		int[] numbers = new int[n-1];
		for (int i=0;i<n-1;i++) {
			numbers[i]=i+2;
		}
		
		for (int p=2;p<n-1;p++) {
			for(int i=2*p;i<n+1;i+=p) {
				numbers[i-2]=0;
			}
		}
		for (int i=0;i<n-1;i++) {
			if (numbers[i]>0)
			{
				System.out.println(numbers[i]);
			}
		}
	}

}