package commands;

import refactoringExercise.DoubleStack;
import refactoringExercise.UI;

public class MultiplicationCommand implements Command {

	@Override
	public void execute(String input, DoubleStack stack, UI gw) {
		double v1 = stack.pop();
		double v2 = stack.pop();
		stack.push(v1*v2);
	}

}
