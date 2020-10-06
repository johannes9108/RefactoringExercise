package commands;

import refactoringExercise.DoubleStack;
import refactoringExercise.SimpleWindow;

public class SubtractionCommand implements Command {

	@Override
	public void execute(String input, DoubleStack stack, SimpleWindow gw) {
		double v1 = stack.pop();
		double v2 = stack.pop();
		stack.push(v2-v1);
	}

}
