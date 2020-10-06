package commands;

import refactoringExercise.DoubleStack;
import refactoringExercise.SimpleWindow;

public interface Command {
	
	void execute(String input,DoubleStack stack, SimpleWindow gw);

}
