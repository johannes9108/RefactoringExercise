package calculator;

public interface Calculator {

	double push(double number);
	double pop();
	double stackSize();
	String stackString();
	
    double addition();
    double subtraction();
    double multiplication();
    double division();

}
