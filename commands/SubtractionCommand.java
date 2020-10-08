package commands;

import java.util.EmptyStackException;
import java.util.Stack;

import refactoringExercise.DoubleStack;
import ui.UI;

public class SubtractionCommand implements Command {

	@Override
	public void execute(String input, Stack<Double> stack, UI ui) {
		double term1 = 0, term2 = 0;
		try {
			term1 = stack.pop();
			term2 = stack.pop();
			stack.push(term2-term1);
			
		}catch(EmptyStackException e) {
			stack.push(term1);
		}
		
	}

}
