package day5_lambda_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LamdaExamples2 {

	public static void main(String[] args) {

		Function<String, Person> pf = Person::new;

		Person person = pf.apply("Sundar");

		System.out.println(person.getName());

		List<String> lettersList = Arrays.asList("A", "B", "C", "D");

		lettersList.stream().forEach(person::print);

		lettersList.stream().forEach(Person::print1);

		// Function<String, Integer> stringToint=Integer::parseInt;

		Function<String, Integer> stringToint = (x) -> Integer.parseInt(x);

		Function<Integer, Integer> squareFun = (x) -> x * x;

		Function<String, Integer> combinedFn = stringToint.andThen(squareFun);

		System.out.println(combinedFn.apply("2"));

		Function<String, Integer> combinedFn2 = squareFun.compose(stringToint);

		System.out.println(combinedFn2.apply("4"));
		

	}

}

class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void print(String s) {
		System.out.println(s);
	}

	public static void print1(String s) {
		System.out.println(s);
	}
}