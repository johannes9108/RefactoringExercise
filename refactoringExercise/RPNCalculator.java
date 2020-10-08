package refactoringExercise;

import commands.Command;
import factory.CommandFactory;

public class RPNCalculator {

	private static UI ui = new SimpleWindow("Calculator");
	private static DoubleStack stack = new DoubleStack();

	public static void main(String[] args) {
		while (true){
			displayApplicationState();
			String input = trimmedInputString();
			Command command = CommandFactory.makeCommand(input.charAt(0));
			
			// Execution of the generated command
			command.execute(input, stack, ui);
			
		}

	}


	private static String trimmedInputString() {
		String input = ui.getString().trim();
		if (input.equals("")) {
			input = " ";
		}
		return input;
	}

	private static void displayApplicationState() {
		if (stack.depth()==0) {
			displayWhenStackIsEmpty();
		} else {
			displayWhenStackHasValues();	
		}
	}


	private static void displayWhenStackHasValues() {
		ui.clear();
		ui.addString(stack.toString());
	}


	private static void displayWhenStackIsEmpty() {
		ui.clear();
		ui.addString("[empty]\n");	
		ui.addString("Commands: q=quit c=clear + - * / number");
	}

}
