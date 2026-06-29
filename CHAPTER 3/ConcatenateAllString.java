package chapter3;

public class ConcatenateAllString {
	    public static void main(String[] args) {
	        String[] words = {"Hello", " ", "World", "!", " Java"};

	        StringBuilder sb = new StringBuilder();

	        for (String word : words) {
	            sb.append(word);
	        }
	        String result = sb.toString();

	        System.out.println("Concatenated String: " + result);
	    }
	}
