package Services;

import common.Operation;
import refactoringExercise.DoubleStack;

public class OperationServiceImpl implements OperationService {

    @Override
    public void executeOperation(Operation operation, DoubleStack stack) {
        double number1 = stack.pop();
        double number2 = stack.pop();
        switch (operation){
            case ADDITION: stack.push(additionOperation(number1, number2));
                break;
            case SUBTRACTION: stack.push(subtractionOperation(number1, number2));
                break;
            case MULTIPLICATION: stack.push(multiplicationOperation(number1, number2));
                break;
            case DIVISION: stack.push(divisionOperation(number1, number2));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
    }

    private double additionOperation(double number1, double number2){
        return number1+number2;
    }
    private double subtractionOperation(double number1, double number2){
        return number1-number2;
    }
    private double multiplicationOperation(double number1, double number2){
        return number1*number2;
    }
    private double divisionOperation(double number1, double number2){
        return number1/number2;
    }
}
