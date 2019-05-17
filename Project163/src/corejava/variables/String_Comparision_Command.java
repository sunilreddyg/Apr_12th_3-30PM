package corejava.variables;

public class String_Comparision_Command {

	public static void main(String[] args) 
	{
		
		/*
		 * String:--> 
		 * 			=> String is a non-primitive datatype
		 * 			=> String accept set of characters to store
		 * 			=> String is not only a datatype and also called as "CLASS".
		 * 				Because string contain set of methods [Events] to manipulate
		 * 				Stored characters..
		 */
		
		
		  
		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two strings and return
		 * 		boolean value true/false.
		 */
		String Act_Result="Account Created";
		String Exp_Result="account created";
		
		boolean flag=Act_Result.equals(Exp_Result);
		System.out.println("Equal comparision is => "+flag);
		
		
		/*
		 * EqualIgnoreCase:-->
		 * 		Method verify equal comparision between two strings by ignoring
		 * 		casesensitive. And return boolean value true/false
		 */
		 boolean flag1=Act_Result.equalsIgnoreCase(Exp_Result);
		 System.out.println("EqualIgnorecase comparision is => "+flag1);
		
		
		/*
		 * Contains:-->
		 * 		Method verify character sequence availability at main string.
		 */
		 String Status="account 100 created succssfull";
		 boolean flag2=Status.contains("100");
		 System.out.println("sub Strings available status is => "+flag2);
		
		 
		 /*
		  * length:-->
		  * 	Method verify count of charcters at string and return total	
		  * 	count in integer format..
		  */
		 String MobileNum="9030248855";
		 int len=MobileNum.length();
		 System.out.println("Chracters length at string is => "+len);
		 
		
		 
		 /*
		  * SubString:-->
		  * 	using substring method we can get sequence of charcters using
		  * 	index number.
		  */
		 String AccountNum="1234567894125635";
		 String Sub=AccountNum.substring(12);
		 System.out.println("Sub String last 4 digit number is => "+Sub);
		 
		 String Sub1=AccountNum.substring(5, 9);
		 System.out.println("String middle characters is => "+Sub1);

		 
		 
		 
		 
		 
	}

}
