package StringMethods1;

public class CharContainsEqualsStrings {

	public static void main(String[] args) {
		
		String s="Welcome";   // concat means concatenate means join
		String s1="to java";
		
		//charAt() adds character
		s="welcome";
		System.out.println(s.charAt(3));
// returns character based on index number 'C' index starts from value 0
		
// CONTAINS METHOD () it compares the values stated then returns with
	//	true or false
		
		System.out.println(s.contains("wel")); // true
        System.out.println(s.contains("Wel")); // false its caps sensitive
        System.out.println(s.contains("com")); // true
        
        //EQUALS METHOD 
        
       System.out.println(s.equals("welcome"));// true
       System.out.println(s.equals("wel come"));// false space not match
       
       // EQUALS IGNORE COMMAND
       
       System.out.println(s.equalsIgnoreCase("Welcome"));
       // will come out true bECASUE it ignores the upper case 
	}

}
