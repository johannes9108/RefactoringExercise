package commands;

import javax.swing.JOptionPane;

import calculator.Calculator;
import refactoringExercise.UI;

public class IlleagalCommand implements Command {

	@Override
	public void execute(UI ui,Calculator calculator) {
		ui.addString("\nIllegal command\n");
		JOptionPane.showMessageDialog(null, "Illeagal Command");
	}

}
