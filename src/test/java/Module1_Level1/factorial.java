package Module1_Level1;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();
        System.out.println(n);
        int x = 1;

        for (int i = 1;  i <= n;  i++){
            x *= i;
        }
        System.out.println(n + x);
    }
}