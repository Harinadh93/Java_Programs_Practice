package Java_Package_Practice;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        sc.close();

        long factorial = 1;

        for(int i = 1; i <= number; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial " + number + " is: " + factorial);
    }
}
