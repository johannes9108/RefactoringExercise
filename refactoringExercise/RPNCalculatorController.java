package refactoringExercise;

import calculator.Calculator;
import commands.Command;
import factory.CommandFactory;

public class RPNCalculatorController {

    private final UI ui;
    private final Calculator calculator;
    //ToDo fundera på om stacken hör hemma i Controller?
    private final DoubleStack stack = new DoubleStack();

    public RPNCalculatorController(UI ui, Calculator calculator) {
        this.ui = ui;
        this.calculator = calculator;
    }

    void init() {
        CommandFactory commandFactory = new CommandFactory(calculator);
        while (true) {
            displayApplicationState();
            String input = trimmedInputString();
            Command command = commandFactory.makeCommand(input.charAt(0));
            command.execute(input, stack, ui);
        }

    }

    private String trimmedInputString() {
        String input = ui.getString().trim();
        if (input.equals("")) {
            input = " ";
        }
        return input;
    }

    private void displayApplicationState() {
        if (stack.size() == 0) {
            displayWhenStackIsEmpty();
        } else {
            displayWhenStackHasValues();
        }
    }

    private void displayWhenStackHasValues() {
        ui.clear();
        ui.addString(stack.toString());
    }

    private void displayWhenStackIsEmpty() {
        ui.clear();
        ui.addString("[empty]\n");
        ui.addString("Commands: q=quit c=clear + - * / number");
    }

}
