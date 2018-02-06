package labtask;
import java.util.*;
import java.math.*;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double result = 0;
		double m, n;
		char operator;
		//boolean done = false;
		while(true){
			m = input.nextDouble();
			operator = input.next().charAt(0);
			n = input.nextDouble();
			if(m == 0.0){
				System.out.println("Bye, now.");
				break;


			}
			switch(operator){
			case '+': result = m + n;
			break;
			case '-': result = m - n;
			break;
			case '*': result = m * n;
			break;
			case '/': result = m / n;
			break;
			case '^': result = Math.pow(m, n);
			break;

			}
			System.out.println(result);


		}

	}
}