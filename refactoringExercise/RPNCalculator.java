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
import factory.CommandFactory;

public class RPNCalculator {

	private static UI gw = new SimpleWindow("Calculator");
	private static DoubleStack stack = new DoubleStack();

	public static void main(String[] args) {
		while (true){
			
			// This section displays the application state
			displayApplicationState();
			
			// This section receives the inputted String and cleans it and converts it into a command
			String input = whiteSpaceCleanedString();
			Command command = CommandFactory.makeCommand(input.charAt(0));
			
			// Execution of the generated command
			command.execute(input, stack, gw);
			
		}

	}


	private static String whiteSpaceCleanedString() {
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
