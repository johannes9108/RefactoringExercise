package commands;

import java.util.Stack;

import refactoringExercise.DoubleStack;
import ui.UI;

public class DigitCommand implements Command {

	@Override
	public void execute(String input, Stack<Double> stack, UI ui) {
		double value = Double.parseDouble(input);
		stack.push(value);
	}

}
