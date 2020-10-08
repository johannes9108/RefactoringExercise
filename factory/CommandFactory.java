package factory;

import commands.AdditionCommand;
import commands.ClearCommand;
import commands.Command;
import commands.DivisionCommand;
import commands.IlleagalCommand;
import commands.MultiplicationCommand;
import commands.NewInputCommand;
import commands.QuitCommand;
import commands.SubtractionCommand;

public interface CommandFactory {

	public static Command makeCommand(char command) {
		if (Character.isDigit(command))
			return new NewInputCommand();

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
