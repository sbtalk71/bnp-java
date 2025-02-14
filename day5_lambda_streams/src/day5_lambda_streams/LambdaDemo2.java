package day5_lambda_streams;

import java.util.function.Predicate;

public class LambdaDemo2 {

	public static void printGreeting(Greeting greeting) {
		System.out.println(greeting.greet());
	}
	
	public static void main(String[] args) {
		Greeting goodMorning=()->"Good Morning";
		
		printGreeting(goodMorning);
		
		printGreeting(()->"Good Morning");
		
		Predicate<Integer> isEven=x->x%2==0;
		
		System.out.println(isEven.test(5));

	}

}

@FunctionalInterface
interface Greeting{

public String greet();

}