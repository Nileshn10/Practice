package first;

public class Startringle {
	public static void main(String[]args) {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=5;j>i-1;j--) {
			System.out.print("*");
			
		}
		System.out.println();
	}

}
}

 class star2{
	 public static void main(String[] args) {
		 int i, j, row = 6;       

		//Outer loop work for rows  

		for (i=0; i<6; i++)   

		{  

		//inner loop work for space      

		for (j=2*(6-i); j>=0; j--)         

		{  

		//prints space between two stars      

		System.out.print(" ");   

		}   

		//inner loop for columns  

		for (j=0; j<=i; j++ )   

		{   

		//prints star      

		System.out.print("* ");   

		}   

		//throws the cursor in a new line after printing each line  

		System.out.println();   

		}   

		}   

		}
