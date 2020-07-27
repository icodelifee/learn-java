import java.util.Scanner;

class FloydsTri {
	public static void main(String args[]){	
		int rows, num = 1, c, j;
		// intialize scanner instance with input stream
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no of rows for triangle");
	
		// returns userinput to variable	
		rows = input.nextInt();
	
		System.out.println("Floyd's Triangle \n");
		for ( c = 1 ; c <= rows ; c++ ){
           		for ( j = 1 ; j <= c ; j++ ){
                		System.out.print(num+" ");
                		num++;
           		}
	        	System.out.println();
		}
	}
}
