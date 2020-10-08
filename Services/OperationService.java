package Services;

import common.Operation;
import refactoringExercise.DoubleStack;

public interface OperationService {

    void executeOperation(Operation operation, DoubleStack stack);
}

