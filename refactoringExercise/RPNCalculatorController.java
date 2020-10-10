package refactoringExercise;

import calculator.Calculator;
import commands.Command;
import factory.CommandFactory;

public class RPNCalculatorController {

    private final UI ui;
    private final Calculator calculator;
    //ToDo fundera på om stacken hör hemma i Controller?


    public RPNCalculatorController(UI ui, Calculator calculator) {
        this.ui = ui;
        this.calculator = calculator;
    }

    void init() {
        CommandFactory commandFactory = new CommandFactory(calculator);
        while (true) {
            displayApplicationState();
            String input = ui.trimmedInputString();
            Command command = commandFactory.makeCommand(input.charAt(0));
            command.execute(calculator,ui);
        }

    }

    

    private void displayApplicationState() {
        if (calculator.stackSize() == 0) {
            displayWhenStackIsEmpty();
        } else {
            displayWhenStackHasValues();
        }
    }

    private void displayWhenStackHasValues() {
        ui.clear();
        ui.addString(calculator.stackString());
    }

    private void displayWhenStackIsEmpty() {
        ui.clear();
        ui.addString("[empty]\n");
        ui.addString("Commands: q=quit c=clear + - * / number");
    }

}
