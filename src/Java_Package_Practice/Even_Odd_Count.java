package Java_Package_Practice;

public class Even_Odd_Count {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 ==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        System.out.println("This is Even Count: "+evenCount);
        System.out.println("This is Odd Count: "+oddCount);
    }
}
