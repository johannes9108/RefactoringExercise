package calculator;

import java.util.EmptyStackException;
import java.util.Stack;

public class CalculatorImpl implements Calculator {
	
	Stack<Double> stack = new Stack<Double>();
	
	

    @Override
    public double addition() {
    	try {
    		return stack.pop() + stack.pop();
    	}catch(EmptyStackException e) {
    		return 0;
    	}
    	
        
    }

    @Override
    public double subtraction() {
    	try {
    		return stack.pop() - stack.pop();
    		}catch(EmptyStackException e) {
    		return 0;
    	}
        
    }

    @Override
    public double multiplication() {
    	try {
    		return stack.pop() * stack.pop();
    	}catch(EmptyStackException e) {
    		return 0;
    	}
        
    }

    @Override
    public double division() {
    	try {
    		return stack.pop() / stack.pop();
    	}catch(EmptyStackException e) {
    		return 0;
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
}
