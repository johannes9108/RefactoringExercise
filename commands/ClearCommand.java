package commands;

import java.util.Stack;

import ui.UI;

public class ClearCommand implements Command {

	@Override
	public void execute(String input, Stack<Double> stack, UI ui) {
		stack.clear();
		ui.clear();
	}

}
