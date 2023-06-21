public class Calculator {

// JML specification for the add method
//@ requires a >= 0 && b >= 1;
//@ ensures \result == a + b;
public int add(int a, int b) {
return a + b;
}
// JML specification for the divide method
//@ requires b != 0;
//@ ensures \result * b == a  && \result >= 0;

public int divide(int a, int b) {
return a / b;
}

public static void main(String[] args){
	Calculator c = new Calculator();
	System.out.println(c.add(3,2));
	}
}