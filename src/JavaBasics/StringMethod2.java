package JavaBasics;

public class StringMethod2 {

	public static void main(String[] args) {
		
		String textFromApplication = "  Enroll today  ";
	      String textFromUserStory = "Enroll today";

	      if(textFromApplication.trim().equals(textFromUserStory)) {
	          System.out.println("Text is matched. Test passed.");
	          
	      } else {
	          System.out.println("Text is NOT matched. Test failed.");
	      }

	      System.out.println(textFromApplication.trim());
	        System.out.println(textFromApplication);

	        String str = "Hello Class";
	        String part2 = str.substring(6);
	        System.out.println(part2);

	        String part1 = str.substring(0,5);
	        System.out.println(part1);

	        String newString = part1.concat(" ").concat(part2);
	        System.out.println(newString);

	        System.out.println(part1+ " " +part2);

	        char single = newString.substring(6).charAt(0);
	        System.out.println(single);

	        String myString = "Today is September";
	        myString = myString.replace("September", "October");
	        System.out.println(myString);

	        myString = myString.replace('A', 'w');
	        System.out.println(myString);

	        String myStr = "Today is a review class";
	        String[] array = myStr.split(" ");
	        System.out.println(array.length);
	        System.out.println(array[3]);

	        for(int i = 0; i<array.length; i++) {
	            System.out.print(array[i] +" ");
	        }

	        System.out.println();

	        //enhanced loop
	        for(String arr:array) {
	            System.out.print(arr +" ");
	        }
	    }
	   

	}
