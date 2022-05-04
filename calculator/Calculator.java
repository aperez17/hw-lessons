import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Input your values here: ");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		System.out.println("You said: " + input);
		String[] parts = input.split(" ");
		double firstNum = Double.parseDouble(parts[0]);
		double secondNum = Double.parseDouble(parts[2]);
		
		String operator = parts[1];
		
		double output = -1;
		if (operator.equals("+")) {
			output = firstNum + secondNum; 
		} else if (operator.equals("-")) {
			output = firstNum - secondNum;
		} else if (operator.equals("*")) {
			output = firstNum * secondNum;
		} else if (operator.equals("/")) {
			output = firstNum / secondNum;
		}
		System.out.println(output);
	}
}
