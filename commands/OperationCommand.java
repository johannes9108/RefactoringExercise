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
    public void execute(String input, DoubleStack stack, UI ui) {
        double num1 = stack.pop();
        double num2 = stack.pop();
        stack.push(operationResult(num1,num2,operation));
    }

    private double operationResult(double num1, double num2, Operation operation) {
        switch (operation) {
            case ADDITION:
                return calculator.addition(num1, num2);
            case SUBTRACTION:
                return calculator.subtraction(num1, num2);
            case MULTIPLICATION:
                return calculator.multiplication(num1, num2);
            case DIVISION:
                return calculator.division(num1, num2);
            default:
                return 0;
        }
    }
}
