package Java_Package_Practice;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();
        int greatest;
        if(num1 > num2 && num1 > num3)
        {
            greatest = num1;
        }
        else if(num2 > num3 && num2 > num1)
        {
            greatest = num2;
        }
        else
        {
            greatest = num3;
        }
        System.out.println("The greatest number is: "+ greatest);
    }
}
