package day5_lambda_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamProcessingDemo1 {

	public static void main(String[] args) {
		
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
		
		//Print all even numbers
		numList.stream().filter(x->x%2==0).forEach(n->System.out.println(n));
		//list all even numbers >2 and <12
		numList.stream().filter(x->x>2&&x<12).filter(x->x%2==0).forEach(System.out::println);
		
		//add 5 to all odd numbers and print
		//sort all the int in DSC order
		//numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		//numList.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);
		
		List<String> namesList=Arrays.asList("rajan","pavan","shantanu","sharmila","ravi","chatur","sharanya");
		
		//count how many names are there
		//collect in a separate list only names having length >5
		
		

	}

}
