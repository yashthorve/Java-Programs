/*			Title: Develop programs for implementation of
                                               	  a) Vector
                                               	  b) HashMap
                                               	   c) Wrapper
			Assignment : Practical 07
			Date:24/10/2023                            Enrollment No:2106207             */

import java.util.Vector;
class Practical07{
	        
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> vector = new Vector<>();

        // Add elements to the Vector
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Access elements from the Vector
        System.out.println("Elements in the Vector:");
        for (Integer num : vector) {
            System.out.println(num);
}
   
// Create a HashMap with <String, Integer> pairs
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 22);

        // Access values by key
        System.out.println("Age of Alice: " + hashMap.get("Alice"));

        // Iterate through the HashMap
        System.out.println("Key-Value pairs in the HashMap:");
        for (String name : hashMap.keySet()) {
            System.out.println(name + ": " + hashMap.get(name));



        // Primitive data types
        int primitiveInt = 10;
        double primitiveDouble = 3.14;

        // Wrapper classes
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        Double wrappedDouble = Double.valueOf(primitiveDouble);

        // Auto-unboxing
        int unboxedInt = wrappedInt;
        double unboxedDouble = wrappedDouble;

        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Unboxed Double: " + unboxedDouble);
        }
}
