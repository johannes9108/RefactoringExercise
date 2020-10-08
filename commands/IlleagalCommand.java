package commands;

import java.util.Stack;

import javax.swing.JOptionPane;

import refactoringExercise.DoubleStack;
import ui.UI;

public class IlleagalCommand implements Command {

	@Override
	public void execute(String input, Stack<Double> stack, UI ui) {
		ui.addString("\nIllegal command\n");
		JOptionPane.showMessageDialog(null, "Illeagal Command");
	}

}
