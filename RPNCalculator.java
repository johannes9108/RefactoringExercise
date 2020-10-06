
public class RPNCalculator {


	public static void main(String[] args) {
		SimpleWindow gw = new SimpleWindow("Calculator");
		DoubleStack stack = new DoubleStack();
		while (true){
			
			// This section clears the prompt
			displayApplicationState(gw, stack);
			
			// This section receives the inputted String and cleans it and converts it into a command
			String input = cleanInputString(gw);
			char command = input.charAt(0);
			
			// The given command determines between the following operations.
			determineOperation(gw, stack, input, command);		
			
		}

	}

	private static void determineOperation(SimpleWindow gw, DoubleStack stack, String input, char command) {
		if (Character.isDigit(command)){
			double value = Double.parseDouble(input);
			stack.push(value);
		} else if(command == '+') {
			double v1 = stack.pop();
			double v2 = stack.pop();
			stack.push(v1+v2);
		} else if(command == '-') {
			double v1 = stack.pop();
			double v2 = stack.pop();
			stack.push(v2-v1);
		} else if(command == '*') {
			double v1 = stack.pop();
			double v2 = stack.pop();
			stack.push(v1*v2);
		} else if(command == '/') {
			double v1 = stack.pop();
			double v2 = stack.pop();
			stack.push(v2/v1);	
		} else if(command == 'c') {
			stack.clear();
			gw.clear();
		} else if(command == 'q') {
			stack.clear();
			gw.exit();
		}else {
			gw.addString("Illegal command\n");
		}
	}

	private static String cleanInputString(SimpleWindow gw) {
		String input = gw.getString().trim();
		if (input.equals("")) {
			input = " ";
		}
		return input;
	}

	private static void displayApplicationState(SimpleWindow gw, DoubleStack stack) {
		if (stack.depth()==0) {
			gw.clear();
			gw.addString("[empty]\n");	
			gw.addString("Commands: q=quit c=clear + - * / number");
		} else {
			gw.clear();
			gw.addString(stack.toString());	
		}
	}

}
