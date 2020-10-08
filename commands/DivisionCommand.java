package commands;

import java.util.EmptyStackException;
import java.util.Stack;

import refactoringExercise.DoubleStack;
import ui.UI;

public class DivisionCommand implements Command {

	@Override
	public void execute(String input, Stack<Double> stack, UI ui) {
		double divisor = 1,dividend = 0;
		

		try {
			dividend = stack.pop();
			divisor = stack.pop();
			stack.push(dividend/divisor);	
			
		}catch(EmptyStackException e) {
			stack.push(dividend);
		}
	}

}
