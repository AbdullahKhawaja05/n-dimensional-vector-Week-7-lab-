package VectorND;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Vector implements Cloneable, Iterable<Double> {

	 private List<Double> coordinates;                 //encapsulation practice
	 private int dimension;
	 
	 
	 public Vector(double... initialCoordinates) {   // constructor that makes new vector with given coordinates in main, dimension is set according to coordinates
		    this.coordinates = new ArrayList<>();    // put coordinates in new array list
		    for (double val : initialCoordinates) {     
		        this.coordinates.add(val);           // assign value to coordinates
		    }
		    this.dimension = this.coordinates.size();   // sets dimension according to number of coordinates
		}
	 
	 public Vector(List<Double> values) {              // construct vector using existing list of coordinates 
		 coordinates = new ArrayList<>(values);
		 this.dimension = values.size();              // set dimension according to list size
	
	 }
	 
	
	 public Vector() {                                  // empty constructor which initialize empty array list and dimension = 0
		    this.coordinates = new ArrayList<>();
		    this.dimension = 0;
		}

	 public void set(int i, double val) {           // we can modify coordinates on certain index in main using this
		 
		 if (i >= 0 && i < this.dimension) {        
		 coordinates.set(i, val);
		 }
		 
		 else {
			 throw new IndexOutOfBoundsException("Index" + i + "is out of bounds of list with length " + this.dimension);
		 }
	 }
	 
	 public Double get(int i) {                    // this fetches us the coordinates at a certain index in arraylist
		
		 if(i >= 0 && i < this.dimension ) {
		 return coordinates.get(i);
		 }
		 
		 else {
			 throw new IndexOutOfBoundsException("Index" + i + "is out of bounds of list with length " + this.dimension);
		 }
	 }
	 
	 public int length() {                      // calculate size of arraylist which is actually just the number of dimensions
		 
		 return this.dimension;
	 }
	 
	 public Vector add(Vector other) {          // vector addition, note that length of vectors meaning dimension must be same
		 
		 if(this.dimension != other.dimension) {
			 throw new IllegalArgumentException("Vectors must have the same length for addition.");
		 }
		 
		 Vector result = new Vector();
		 
		 for(int i = 0; i < this.dimension; i++) {
			 
			 result.coordinates.add(this.get(i) + other.get(i));
		 }
		 
		 result.dimension = this.dimension;
		 return result;
		
		 	 	 
	 }
	 
	 public Vector crossProduct(Vector other) {            //cross product of vector, note that vectors must be 3 dimensional 
	        if (this.dimension != 3 || other.dimension != 3) {
	            throw new IllegalArgumentException("Cross product is only defined for 3-dimensional vectors.");
	        }
	        
	        double x = this.get(1) * other.get(2) - this.get(2) * other.get(1);
	        double y = this.get(2) * other.get(0) - this.get(0) * other.get(2);
	        double z = this.get(0) * other.get(1) - this.get(1) * other.get(0);
	        
	        return new Vector(x, y, z);
	    }
	 
	 public double dotProduct(Vector other) {                  // dot product of vector, note that dimension of vectors must be same
	        if (this.dimension != other.dimension) {
	            throw new IllegalArgumentException("Vectors must have the same dimension for dot product.");
	        }
	        double sum = 0.0;
	        for (int i = 0; i < this.dimension; i++) {
	            sum += this.get(i) * other.get(i);
	        }
	        return sum;
	    }


	 public boolean hasNext() {                          // these came with the iterable interface which is built in inside java
		return false;
	 }

	 public Double next() {                              // same as above
		return null;
	 }
	 
	
	 @Override  
	    public String toString() {                        // prints vectors in <> form
	        StringBuilder sb = new StringBuilder("<");
	        for (int i = 0; i < coordinates.size(); i++) {
	            sb.append(coordinates.get(i));
	            if (i < coordinates.size() - 1) {
	                sb.append(", ");
	            }
	        }
	        sb.append(">");
	        return sb.toString();
	        
	 }
	 
	 public boolean equals(Object o) {         // it is checking if two vectors are eual
		 
		 if( this == o) {                 // Object o is a superclass of all objects, we can feed any data type for e.g: vector 
			 return true;
		 }
		 
		 if(o == null || getClass() != o.getClass()) {
			 
			 return false;
		 }
		 
		 Vector vector = (Vector) o;   // converts object to vector, this is typecasting
		 
		 return this.dimension == vector.dimension && this.coordinates.equals(vector.coordinates); // if vectors have same dimension and coordinates, it is equal
		
	 }
	 
	 @Override
	 public int hashCode() {                               //hash code is a unique identifier for each object, helps in keeping track in memory, this is little bit unclear to me
		 
		 return Objects.hash(coordinates, dimension);
	 }
	 
	 @Override
		public Vector clone() {    // we are creating a deep copy here (cloning)< this is useful to understand how to copy and make new vectors without modifying original ones
			try {
				Vector clonedVector = (Vector) super.clone();  
				clonedVector.coordinates = new ArrayList<>(this.coordinates);
				clonedVector.dimension = this.dimension;
				return clonedVector;
			}
			catch (CloneNotSupportedException e) {
				throw new AssertionError("CloneNotSupportedException should not occur with Cloneable interface.");
			}
			
			
		    }
	 
	 public Iterator<Double> iterator() {                  // iterator method for running for each loop, little bit unclear
	        return coordinates.iterator();
	    }
	 
	 
		}
	 
	 


