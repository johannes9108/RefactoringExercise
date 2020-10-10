package commands;

import calculator.Calculator;
import refactoringExercise.DoubleStack;
import refactoringExercise.UI;

public class DigitCommand implements Command {
	
	private double digit;
	
	
	public DigitCommand(double digit) {
		this.digit = digit;
	}


	@Override
	public void execute(UI ui,Calculator calculator) {
		calculator.push(digit);
	}

}
