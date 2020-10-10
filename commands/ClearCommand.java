package commands;

import calculator.Calculator;
import refactoringExercise.DoubleStack;
import refactoringExercise.UI;

public class ClearCommand implements Command {

	@Override
	public void execute(UI ui,Calculator calculator) {
//		stack.clear();
		ui.clear();
	}

}
