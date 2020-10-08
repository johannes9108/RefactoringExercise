package ui;

import java.io.InputStream;
import java.util.Scanner;

import refactoringExercise.DoubleStack;

public class CustomCLI implements UI {
	
	
	private static Scanner scanner = new Scanner(System.in);
	
	@Override
	public String getString() {
		System.out.print("Next Input: ");
		String readLine = scanner.next();
		return readLine;
	}

	@Override
	public void addString(String s) {
		System.out.println(s);
	}

	@Override
	public void clear() {
		
	}

	@Override
	public void exit() {
		System.exit(0);
	}



}
