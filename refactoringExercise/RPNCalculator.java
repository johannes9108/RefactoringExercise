package refactoringExercise;

import commands.AdditionCommand;
import commands.ClearCommand;
import commands.Command;
import commands.DivisionCommand;
import commands.IlleagalCommand;
import commands.MultiplicationCommand;
import commands.NewInputCommand;
import commands.QuitCommand;
import commands.SubtractionCommand;

public class RPNCalculator {

	private static SimpleWindow gw = new SimpleWindow("Calculator");
	private static DoubleStack stack = new DoubleStack();

	public static void main(String[] args) {
		while (true){
			
			// This section clears the prompt
			displayApplicationState();
			
			// This section receives the inputted String and cleans it and converts it into a command
			String input = cleanInputString();
			Command command = determineCommand(input.charAt(0));
			
			// Execution of the generated command
			command.execute(input, stack, gw);
			
		}

	}

	private static Command determineCommand(char command) {
		if (Character.isDigit(command)){
			return new NewInputCommand();
		} else if(command == '+') {
			return new AdditionCommand();
		} else if(command == '-') {
			return new SubtractionCommand();
		} else if(command == '*') {
			return new MultiplicationCommand();
		} else if(command == '/') {
			return new DivisionCommand();
		} else if(command == 'c') {
			return new ClearCommand();
		} else if(command == 'q') {
			return new QuitCommand();
		}else {
			return new IlleagalCommand();
		}
	}

	private static String cleanInputString() {
		String input = gw.getString().trim();
		if (input.equals("")) {
			input = " ";
		}
		return input;
	}

	private static void displayApplicationState() {
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
