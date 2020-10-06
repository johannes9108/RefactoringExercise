package commands;

import refactoringExercise.DoubleStack;
import refactoringExercise.SimpleWindow;

public class IlleagalCommand implements Command {

	@Override
	public void execute(String input, DoubleStack stack, SimpleWindow gw) {
		gw.addString("Illegal command\n");
	}

}
