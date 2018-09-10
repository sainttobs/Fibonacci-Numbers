//Java Program To Compute Fibonacci Numbers
import java.util.*;
public class FibonacciSequence{
    static Scanner input = new Scanner(System.in);
    public static int getN(){
        System.out.println("Compute for how many numbers");
        int n = input.nextInt();
        return n;
    }
    public static void main(String[] args) {
        int n = getN();
        int t1 = 0 , t2 = 1;
        System.out.print("First " + n + "terms :");
        for (int i =1; i <= n ; i++ ) {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2; 
            t2 = sum;
        }
    }
}
