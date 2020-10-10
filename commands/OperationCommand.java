package commands;

import calculator.Calculator;
import common.Operation;
import refactoringExercise.DoubleStack;
import refactoringExercise.UI;

public class OperationCommand implements Command {

    private Calculator calculator;
    private Operation operation;

    public OperationCommand(Calculator calculator, Operation operation) {
        this.calculator = calculator;
        this.operation = operation;
    }

    @Override
    public void execute(String input, UI ui) {
       operationResult(operation);
    }

    private double operationResult(Operation operation) {
        switch (operation) {
            case ADDITION:
                return calculator.addition();
            case SUBTRACTION:
                return calculator.subtraction();
            case MULTIPLICATION:
                return calculator.multiplication();
            case DIVISION:
                return calculator.division();
            default:
                return 0;
        }
    }
}
