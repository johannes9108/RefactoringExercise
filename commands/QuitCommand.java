package commands;

import java.util.Stack;

import refactoringExercise.DoubleStack;
import ui.UI;

public class QuitCommand implements Command {

	@Override
	public void execute(String input, Stack<Double> stack, UI ui) {
		stack.clear();
		ui.exit();
	}

}
