package commands;

import java.util.Stack;

import refactoringExercise.DoubleStack;
import ui.UI;

public interface Command {
	
	void execute(String input,Stack<Double> stack, UI ui);

}
