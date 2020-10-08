package refactoringExercise;

import calculator.Calculator;
import calculator.CalculatorImpl;
import commands.Command;
import factory.CommandFactory;

public class RPNCalculator {

	public static void main(String[] args) {
		UI ui = new SimpleWindow("Calculator");
		Calculator calculator = new CalculatorImpl();
		RPNCalculatorController controller = new RPNCalculatorController(ui,calculator);
		controller.init();

	}

}
