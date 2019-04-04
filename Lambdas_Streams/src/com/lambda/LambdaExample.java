package com.lambda;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExample {

	public static void main(String args[]) throws IOException {
		LambdaExample lambda = new LambdaExample();

		MathOpr addition = (x,y) -> x + y; 
		MathOpr subtraction = (x,y) -> { return x - y; }; 
		MathOpr multiplication = (x,y) -> x * y; 
		MathOpr division = (x,y) -> x / y; 

		//lambda.operate(2,3,addition);

		List list = new ArrayList();
		list.add("AVignesh");
		list.add("BVignesh");
		list.add("CVignesh");
		list.add("DVignesh");

		System.out.println(filterEmployees(list, startsWithFunc("B")) );

		Consumer consumer1 = (x)-> System.out.println(x);
		Consumer consumer2 = (x)-> System.out.println("Sorted "+x);

		list.forEach(consumer1);

		Comparator<String> comparator = (x,y) -> x.compareTo(y);

		list.parallelStream().sorted(comparator).forEach(consumer2);

		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyGender = Optional.empty();
		
		// Creating a list of Prime Numbers 
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13); 
          
        // Creating a list of Odd Numbers 
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5); 
          
        // Creating a list of Even Numbers 
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8); 
  
        List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers); 
  
        System.out.println("The Structure before flattening is : " +listOfListofInts); 
		
		List<Integer> listofInts = listOfListofInts.parallelStream().flatMap(list1 -> list1.stream()).collect(Collectors.toList());
		
		System.out.println("The Structure after flattening is : " +listofInts); 

		System.out.println(gender.filter(g -> g.equals("male"))); //Optional.empty
		System.out.println(gender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional[MALE]
		System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional.empty

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		Files.list(Paths.get(".")).forEach(System.out::println);
		
		//Get the file reference
		Path path = Paths.get("D:/Samplee/ZZZZZ.txt");
		 
		//Use try-with-resource to get auto-closeable writer instance
		try (BufferedWriter writer = Files.newBufferedWriter(path))
		{
		    writer.write("Hello World !!");
		}
		
		String content = "Vignesh";
		Files.write(Paths.get("D:/Samplee/ZZZZZ.txt"),content.getBytes());
		
		System.out.println("Done");
		
	}

	interface MathOpr{
		public int operation(int a, int b);
	}

	public void operate(int a, int b, MathOpr mathOpr) {
		System.out.println(mathOpr.operation(a, b));
	}

	public static List filterEmployees(List list, Predicate predicate)
	{
		return (List)list.parallelStream().filter(predicate).collect(Collectors.toList());
	}

	public static Predicate<String> startsWithFunc(String startsWithChar)
	{
		return p -> p.startsWith(startsWithChar);
	}

}