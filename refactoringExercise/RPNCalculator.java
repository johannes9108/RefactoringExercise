package refactoringExercise;

import java.util.Stack;

import commands.Command;
import factory.CommandFactory;
import ui.CustomCLI;
import ui.SimpleWindow;
import ui.UI;

public class RPNCalculator {

	private static UI ui = new SimpleWindow("Calculator");
	private static Stack<Double> stack = new Stack<Double>();

	public static void main(String[] args) {
		while (true){
			
			// This section displays the application state
			ui.displayApplicationState(stack);
			
			// This section receives the inputted String and cleans it and converts it into a command
			String input = ui.trimmedInputString();
			char commandCharacter = input.charAt(0);
			Command command = CommandFactory.makeCommand(commandCharacter);
			
			System.out.println(input);
			// Execution of the generated command
			command.execute(input, stack, ui);
			
		}

	}




}
