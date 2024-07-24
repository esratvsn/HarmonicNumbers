import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double result = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a N number:");
        n = input.nextInt();

        for (double i = 1;  i <= n;  i++) {
        result+=(1/i);
        }
        //1.loop: 1
        //2.loop:1/2+1=1.5

        System.out.print("Result: " + result);
    }
}