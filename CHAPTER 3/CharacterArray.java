package chapter3;

public class CharacterArray {

	    public static void main(String[] args) {
	   
	        char[] charArray = {'H', 'e', 'l', 'l', 'o', '!', ' ' , 'F', 'r', 'i', 'e', 'n', 'd'};

	        for (int i = 0; i < charArray.length; i++) {
	            System.out.println("Character at index " + i + ": " + charArray[i]);
	        }

	        System.out.println("All characters: " + new String(charArray));
	    }
	}
