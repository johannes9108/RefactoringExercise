package commands;

import refactoringExercise.DoubleStack;
import refactoringExercise.UI;

public class IlleagalCommand implements Command {

	@Override
	public void execute(String input, DoubleStack stack, UI gw) {
		gw.addString("Illegal command\n");
	}

}
