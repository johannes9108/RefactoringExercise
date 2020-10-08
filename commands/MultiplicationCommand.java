package commands;

import java.util.EmptyStackException;
import java.util.Stack;

import refactoringExercise.DoubleStack;
import ui.UI;

public class MultiplicationCommand implements Command {

	@Override
	public void execute(String input, Stack<Double> stack, UI ui) {
		double factor1=0,factor2=0;

		try {
			factor1 = stack.pop();
			factor2 = stack.pop();
			stack.push(factor1*factor2);
			
		}catch(EmptyStackException e) {
			stack.push(factor1);
		}
	}

}
