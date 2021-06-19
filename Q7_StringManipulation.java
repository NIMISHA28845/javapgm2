import java.util.*;

class Q7_StringManipulation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of a string");
		System.out.println("------------------\n");
		System.out.println("Enter a string: ");
		String str1 = sc.next();
		System.out.println("Length of the string is : " + str1.length());
		System.out.println("\n");

		System.out.println("String Concatenation");
		System.out.println("--------------------\n");
		System.out.println("Enter first string: ");
		String s1 = sc.next();
		System.out.println("Enter secound string: ");
		String s2 = sc.next();
		String s3 = s1 + s2;
		System.out.println("After concatenation : " + s3);
		System.out.println("\n");

		System.out.println("String Character Extraction");
		System.out.println("---------------------------\n");
		System.out.println("Enter a string: ");
		String string1 = sc.next();
		System.out.println("Enter character position: ");
		int n = sc.nextInt();
		char ch = string1.charAt(n - 1);
		System.out.println("Character at position " + n + " is " + ch);
		System.out.println("\n");

		System.out.println("String Equals");
		System.out.println("-------------\n");
		System.out.println("Enter first string: ");
		String st1 = sc.next();
		System.out.println("enter secound string: ");
		String st2 = sc.next();
		if (st1.equals(st2)) {
			System.out.println("Both the strings are same\n");
		} else {
			System.out.println("Both the strings are different\n");
		}

		System.out.println("Upper case and Lower case");
		System.out.println("-------------------------\n");
		System.out.println("Enter a string: ");
		String stg = sc.next();
		String lower = stg.toLowerCase();
		System.out.println("Lower case string :" + lower);
		String upper = stg.toUpperCase();
		System.out.println("Upper case string :" + upper);
		System.out.println("\n");
	}
}