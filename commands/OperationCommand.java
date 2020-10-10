package commands;

import calculator.Calculator;
import common.Operation;
import refactoringExercise.DoubleStack;
import refactoringExercise.UI;

public class OperationCommand implements Command {

	private Operation operation;

	public OperationCommand(Operation operation) {
		this.operation = operation;
	}

	@Override
	public void execute(UI ui, Calculator calculator) {
		operationResult(operation, calculator);
	}

	private void operationResult(Operation operation, Calculator calculator) {
		System.out.println("Operation: " + operation);
		switch (operation) {
		case ADDITION:
			calculator.addition();
			break;
		case SUBTRACTION:
			calculator.subtraction();
			break;
		case MULTIPLICATION:
			calculator.multiplication();
			break;
		case DIVISION:
			calculator.division();
			break;
		default:
			break;

		}
	}
}
