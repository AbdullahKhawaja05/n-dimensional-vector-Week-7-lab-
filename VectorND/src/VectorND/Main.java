package VectorND;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Double> myList = Arrays.asList(4.0, 5.0, 6.0);    // now these are testing operations for methods in class
		Vector v1 = new Vector(myList);
		System.out.println("Vector v1: " + v1);     
		
		List<Double> myList2 = Arrays.asList(3.0, 6.0, 8.0);
		Vector v2 = new Vector(myList2);
		System.out.println("Vector v2: " + v2);
		
		System.out.println("Length of v1: " + v1.length());
		System.out.println("Length of v2: " + v2.length());
		
		System.out.println("-----------");
		

		System.out.println("Value of v1 at index 0: " + v1.get(0));
		System.out.println("Value of v2 at index 3: " + v2.get(2));
		
		System.out.println("-----------");
		
		System.out.println("Testing Modification to existing Vectors: ");
		v1.set(0, 22.0);
		System.out.println("New modified v1: " + v1);
		
		v2.set(2, 15.0);
		System.out.println("New modified v2: " + v2);
		
		System.out.println("-----------");
		
		System.out.println("Testing addition: ");
		
		Vector sum = v1.add(v2);
		System.out.println("v1 + v2: " + sum);
		
		System.out.println("-----------");
		
		System.out.println("Iteration through v1: ");
		for(Object coord : v1) {
			System.out.println("- " + coord);
		}
		
		System.out.println("-----------");
		
		
		Vector v3 = new Vector(4.0, 5.0, 6.0);
		System.out.println("Testing equals method: ");
		System.out.println("v1 equals v3: " + v1.equals(v3));
		
		System.out.println("-----------");
		
		System.out.println("Testing cloning: ");
		Vector v3Cloned = v3.clone();
		
		System.out.println("v3 clone: " + v3Cloned);
		
		System.out.println("-----------");
		
		System.out.println("Demonstrating Deep copy by modifying coordinates");
		
		v1.set(2, 13.0);
		Vector v1Cloned = v1.clone();
		System.out.println("Modified v1 clone: " + v1Cloned);
		
		System.out.println("-----------");
		
		System.out.println("Testing Cross Product of v1 and v3: ");
	    Vector crossResult = v1.crossProduct(v3);
	    System.out.println(crossResult);
	    		
	    System.out.println("-----------");
	    		
		System.out.println("Testing Dot Product of v1 and v3: ");
		double dotResult = v1.dotProduct(v3);
		System.out.println(dotResult);
	
		
		
		
	}

}
