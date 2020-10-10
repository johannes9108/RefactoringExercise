package commands;

import calculator.Calculator;
import refactoringExercise.DoubleStack;
import refactoringExercise.UI;

public class QuitCommand implements Command {

	@Override
	public void execute(UI ui,Calculator calculator) {
		calculator.clearStack();
		ui.exit();
	}

}
