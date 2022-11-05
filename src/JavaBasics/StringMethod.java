package JavaBasics;

public class StringMethod {

	public static void main(String[] args) {
		
		String str = "hello";
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);

        //length() -> returns the length of the string
        int size = str.length();
        System.out.println(size);

        //chartAt() -> returns the char value at the specified index
        char letter = str.charAt(0);
        System.out.println(letter);

        //to get the last character
        char lastCharacter = str.charAt(str.length()-1);
        System.out.println(lastCharacter);

        //indexOf -> returns the index within string of the first occurrence of the specified character
        int index = str.indexOf(lastCharacter);
        System.out.println(index);

        System.out.println(str.indexOf('e'));
        System.out.println(str);

        //isEmpty() -> returns true if length is more than 0
        boolean empty = str.isEmpty();
        System.out.println(empty);

    
	}

}
