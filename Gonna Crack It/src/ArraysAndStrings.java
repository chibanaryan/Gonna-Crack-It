
public class ArraysAndStrings {

	public static void main(String[] args) {
		//QuestionOne();
		QuestionThree();
	}
	
	public static void QuestionOne() {
		System.out.println("Question one:");
		String[] examples = {"dog", "dod", "super", "January", "coo"};
		for (String example : examples) {
			System.out.println(example + ": " + UniqueCharTryOne(example));;
		}
	}
	public static boolean UniqueCharTryOne(String s) {
		char c;
		for (int i = 0; i < s.length()-1; i++) {
			c = s.charAt(i);
			for (int j = i + 1; j < s.length(); j++) {
				char d;
				d = s.charAt(j);
				if (c == d) return false;
			}
		}
		return true;
	}
	
	public static void QuestionThree() {
		System.out.println("Question three:");
		String[] originals = {"dog", "shod", "try", "ghost"};
		String[] perms = {"god", "dosh", "write", "sonny"};
	}
	
	public static boolean PermutationsTryOne(String s1, String s2) {
		int[] asciiCount = new int[127];
		//initializing array of alphabet values
		for (char c : s1.toCharArray()) {
			int diff = c;
			System.out.println(diff + " is the ascii value");
			
		}
		
		
		return false;
	}

}
