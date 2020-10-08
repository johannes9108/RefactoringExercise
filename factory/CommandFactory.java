package factory;

import commands.operationCommands.AdditionCommand;
import commands.ClearCommand;
import commands.Command;
import commands.operationCommands.DivisionCommand;
import commands.IlleagalCommand;
import commands.operationCommands.MultiplicationCommand;
import commands.DigitCommand;
import commands.QuitCommand;
import commands.operationCommands.SubtractionCommand;

public interface CommandFactory {

	public static Command makeCommand(char command) {
		if (Character.isDigit(command))
			return new DigitCommand();

		switch (command) {
		case '+':
			return new AdditionCommand();
		case '-':
			return new SubtractionCommand();
		case '*':
			return new MultiplicationCommand();
		case '/':
			return new DivisionCommand();
		case 'c':
			return new ClearCommand();
		case 'q':
			return new QuitCommand();
		default:
			return new IlleagalCommand();
		}

	}

}
