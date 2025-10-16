import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number , min;
		number = input.nextInt();
		min = number;
		
		while (number != -1) {
			number = input.nextInt();
		if (number < min)
			if (number != -1)	
				min = number;	
		}	
		System.out.println("min is " + min);
		System.out.println("number is " + number);
	}
}