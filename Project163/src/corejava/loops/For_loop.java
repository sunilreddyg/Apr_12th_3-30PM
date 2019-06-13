package corejava.loops;

public class For_loop 
{

	public static void main(String[] args)
	{
		
		/*
		 * Example:-->
		 * 		Print number from 1 to 20
		 */
		
		 for (int i = 1; i <= 20; i++) 
		 {
			System.out.println(i);
		 }
		
		

		/*
		 * Exmaple:--> Conduct sum between 1 to 100
		 */
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("Total sum value is => "+sum);
		 
		 
		
		/*
		 * Example:--> Print array next value using index value
		 */
		String tools[]={"IDE","RC","WD","GRID"};
		
		//Get Number of String available at array
		int len=tools.length;
		System.out.println("Array length is => "+len);
		
		
		//Iterate for number of array values
		for (int i = 0; i < tools.length; i++) 
		{
			System.out.println("=> "+tools[i]);
		}
		
		
		
		
		
		

	}

}
