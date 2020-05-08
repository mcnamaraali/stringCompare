
public class StringCompare {

	public static void main(String[] args) {
		
		String string1 = new String("goodbye");
		String string2 = ("goodbye");
		String string3 = ("Happy Birthday");
		String string4 = ("happy birthday"); //lower case h and b
		
		/*System.out.printf("string1 is %s%n string2 is %s%n string3 is %s%n string 4 is %s%n", 
			string1, string2, string3, string4);*/
		
		if(string1.equals("Hello")) { // this is case sensitive
			System.out.println("string1 equals \"Hello\"");
		}
		else {
			System.out.println("string1 does not equal \"hello\"");
		}
		
		if(string1 == "hello") {
			System.out.println("string1 is the same object as \"hello\"");
		}
		else {
			System.out.println("string1 is not the same object as \"hello\"");
		}
		
		if(string3.equalsIgnoreCase(string4)) {
			System.out.printf("%s equals %s with case ignored%n", string3, string4);
		}
		else {
			System.out.printf("string3 does not equal s4");
		}
		
		//compareTo
		System.out.printf("%n string1.compareTo(string2) %d%n", string1.compareTo(string2));
		
		//test regionMatches (case Sensitive)
		if(string3.regionMatches(0, string4, 0, 5)) {
			System.out.printf("First 5 characters of s3 and s4 match%n");
		} 
		else {
			System.out.printf("First 5 chars of s3 do not match s4%n");
		}
		
		//test regionMatches (ignore case)
		if(string3.regionMatches(true, 0, string4, 0, 5)) {
			System.out.printf("First 5 characters of s3 and s4 match with case ignored");
		} 
		else {
			System.out.printf("First 5 chars of s3 do not match s4");
		}
		
	}

}
