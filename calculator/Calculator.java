package calculator;

public interface Calculator {

	double push(double number);
	double pop();
	double stackSize();
	String stackString();
	void clearStack();
	
    void addition();
    void subtraction();
    void multiplication();
    void division();
	

}
