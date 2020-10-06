package commands;

import java.util.Stack;

import refactoringExercise.DoubleStack;
import refactoringExercise.SimpleWindow;

public class AdditionCommand implements Command{

	@Override
	public void execute(String input, DoubleStack stack, SimpleWindow gw) {
		double v1 = stack.pop();
		double v2 = stack.pop();
		stack.push(v1+v2);
	}

}
