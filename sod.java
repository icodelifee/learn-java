import java.util.Scanner;

class SOD {
	public static void main(String args[]){
		long n, sum;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a num : ");
		n = ip.nextLong();
		for( sum=0 ; n!=0; n/=10){
			sum+=n%10;
		}
		System.out.println("Sum of digits "+sum);		
	}
}
