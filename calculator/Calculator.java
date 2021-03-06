import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Input your values here: ");
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		String[] parts = parseInput(input);
		double currValue = Double.parseDouble(parts[0]);
		
		int loops = (parts.length - 1) / 2;
		for (int i = 1; i <= loops; i++) {
			double secondNum = Double.parseDouble(parts[2 * i]);		
			String operator = parts[2 * i - 1];
			
			if (operator.equals("+")) {
				currValue = currValue + secondNum; 
			} else if (operator.equals("-")) {
				currValue = currValue - secondNum;
			} else if (operator.equals("*")) {
				currValue = currValue * secondNum;
			} else if (operator.equals("/")) {
				currValue = currValue / secondNum;
			} else if (operator.equals("^")) {
				currValue = Math.pow( currValue, secondNum);
			} else if (operator.equals("pyth")) {
				currValue = pythThm(currValue , secondNum);
			}
		}
		

		System.out.println(currValue);
	}
	
	public static String[] parseInput(String input) {
		System.out.println("You said: " + input);
		String[] parts = input.split(" ");
		return parts;
	}
	
	public static double pythThm(double a , double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
	}
}
