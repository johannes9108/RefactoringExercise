package commands;


import java.util.EmptyStackException;
import java.util.Stack;

import ui.UI;

public class AdditionCommand implements Command{

	@Override
	public void execute(String input, Stack<Double> stack, UI ui) {
		double term1 = 0, term2 = 0;
		try {
			term1 = stack.pop();
			term2 = stack.pop();
			stack.push(term1+term2);
			
		}catch(EmptyStackException e) {
			stack.push(term1);
		}
		
		
	}

}
