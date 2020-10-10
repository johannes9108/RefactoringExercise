package commands;

import calculator.Calculator;
import refactoringExercise.DoubleStack;
import refactoringExercise.UI;

public interface Command {
	
	void execute(UI ui,Calculator calculator);

}
