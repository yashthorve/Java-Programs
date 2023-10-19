		/*	Title: Develop programs for implementation of different
			function of String and StringBuffer Class.
			Assignment : Practical 06

			Date:24/10/2023                            Enrollment No:2106207             */


class Practical06{
		
    public static void main(String[] args) {
       // Creating a string
        String str1 = "Hello, World!";
        String str2 = "Java Programming";
        
        // Finding the length of a string
        int length1 = str1.length();
        int length2 = str2.length();
        System.out.println("Length of str1: " + length1);
        System.out.println("Length of str2: " + length2);
        
        // Concatenating strings
        String combined = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + combined);
        
      // Replacing characters in a string
        String replacedString = str1.replace('o', 'X'); // Replace 'o' with 'X'
        System.out.println("Replaced string: " + replacedString);
        
        // Converting to uppercase/lowercase
        String uppercase = str2.toUpperCase();
        String lowercase = str2.toLowerCase();
        System.out.println("Uppercase str2: " + uppercase);
        System.out.println("Lowercase str2: " + lowercase);
        
       
                    	

	}
}
/*		
//String buffer program

        // Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Appending text to the StringBuffer
        stringBuffer.append(" World");
        System.out.println("After appending: " + stringBuffer);

        // Inserting text at a specific position
        stringBuffer.insert(5, ", Java");
        System.out.println("After inserting: " + stringBuffer);

        // Deleting characters from the StringBuffer
        stringBuffer.delete(5, 10);
        System.out.println("After deleting: " + stringBuffer);

        // Reversing the StringBuffer
        stringBuffer.reverse();
        System.out.println("After reversing: " + stringBuffer);

        // Converting the StringBuffer to a String
        String result = stringBuffer.toString();
        System.out.println("Final result as String: " + result);
    }
}
*/
