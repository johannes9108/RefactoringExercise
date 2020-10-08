package commands;

import javax.swing.JOptionPane;

import refactoringExercise.DoubleStack;
import refactoringExercise.UI;

public class IlleagalCommand implements Command {

	@Override
	public void execute(String input, DoubleStack stack, UI ui) {
		ui.addString("\nIllegal command\n");
		JOptionPane.showMessageDialog(null, "Illeagal Command");
	}

}
