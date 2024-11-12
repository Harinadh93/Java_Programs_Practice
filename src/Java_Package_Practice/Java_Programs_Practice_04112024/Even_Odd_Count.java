package Java_Package_Practice.Java_Programs_Practice_04112024;

public class Even_Odd_Count {


    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int evenCount = 0;
        int oddCount = 0;

        for(int c : a)
        {
            if(c % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        System.out.println("Even Count is: "+evenCount);
        System.out.println("Odd Count is: "+oddCount);
    }
}
