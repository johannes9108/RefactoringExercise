package factory;

import calculator.Calculator;
import commands.ClearCommand;
import commands.Command;
import commands.DigitCommand;
import commands.IlleagalCommand;
import commands.OperationCommand;
import commands.QuitCommand;
import common.OperationMap;

public class CommandFactory {
	private Calculator calculator;

	public CommandFactory(Calculator calculator) {
		this.calculator = calculator;
	}

	public Command makeCommand(char command) {

		if (Character.isDigit(command))
			return new DigitCommand();

		if (OperationMap.getCommandOperationMap().containsKey(Character.toString(command))){
			return new OperationCommand(calculator, OperationMap.getCommandOperationMap().get(Character.toString(command)));
		}

		switch (command) {
		case 'c':
			return new ClearCommand();
		case 'q':
			return new QuitCommand();
		default:
			return new IlleagalCommand();
		}

	}

}
