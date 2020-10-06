package commands;

import refactoringExercise.DoubleStack;
import refactoringExercise.SimpleWindow;

public class NewInputCommand implements Command {

	@Override
	public void execute(String input, DoubleStack stack, SimpleWindow gw) {
		double value = Double.parseDouble(input);
		stack.push(value);
	}

}
