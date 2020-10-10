package factory;

import calculator.Calculator;
import commands.ClearCommand;
import commands.Command;
import commands.DigitCommand;
import commands.IlleagalCommand;
import commands.OperationCommand;
import commands.QuitCommand;
import common.OperationMap;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class CommandFactory {
	private static final String digitPattern = "\\d+";

	public static Command makeCommand(String command) {

		if (command.matches(digitPattern)) {
			System.out.println(command);
			return new DigitCommand(Double.parseDouble(command));
		}

		if (OperationMap.getCommandOperationMap().containsKey(command)){
			return new OperationCommand(OperationMap.getCommandOperationMap().get(command));
		}

		switch (command.charAt(0)) {
		case 'c':
			return new ClearCommand();
		case 'q':
			return new QuitCommand();
		default:
			return new IlleagalCommand();
		}

	}

}
