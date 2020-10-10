package calculator;

import java.util.EmptyStackException;
import java.util.Stack;

public class CalculatorImpl implements Calculator {
	
	Stack<Double> stack = new Stack<Double>();
	
	

    @Override
    public void addition() {
    	double term1 = 0;
    	try {
    		term1 = stack.pop();
    		double res = term1 + stack.pop();
    		stack.push(res);
    	}catch(EmptyStackException e) {
    		stack.push(term1);
    	}
    	
        
    }

    @Override
    public void subtraction() {
    	double term1 = 0;
    	try {
    		term1=stack.pop();
    		double res = term1 - stack.pop();
    		stack.push(res);
    		}catch(EmptyStackException e) {
    		stack.push(term1);
    	}
        
    }

    @Override
    public void multiplication() {
    	double factor1 = 0;
    	try {
    		factor1=stack.pop();
    		double res = factor1 * stack.pop();
    		stack.push(res);
    	}catch(EmptyStackException e) {
    		stack.push(factor1);
    	}
        
    }

    @Override
    public void division() {
    	double dividend = 1;
    	try {
    		dividend = stack.pop();
    		double res = dividend / stack.pop();
    		stack.push(res);
    	}catch(EmptyStackException e) {
    		
    		stack.push(dividend);
    	}
    }

	@Override
	public double push(double number) {
		return stack.push(number);
		
	}

	@Override
	public double pop(){
		return stack.pop();
		
	}

	@Override
	public double stackSize() {
		return stack.size();
	}
	@Override
	public String stackString() {
		return stack.toString();
	}

	@Override
	public void clearStack() {
		stack.clear();
	}
}
