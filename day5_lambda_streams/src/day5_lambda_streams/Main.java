package day5_lambda_streams;

public class Main {

	public static void main(String[] args) {
		
		MathOperation adder=(a, b)->a+b;
	
		System.out.println(adder.operation(3, 4));

		MathOperation product=new Multiply();
		System.out.println(product.operation(3, 4));
	}

}

class Add implements MathOperation{
	@Override
	public int operation(int a, int b) {
		
		return a+b;
	}
}


class Multiply implements MathOperation{
	@Override
	public int operation(int a, int b) {
		return a*b;
	}
}
