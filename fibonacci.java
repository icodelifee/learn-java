import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        int n = input.nextInt(); 
	int t1 = 0, t2 = 1;

        System.out.print("Fibonnaci Series Of "+n+" : \n");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
