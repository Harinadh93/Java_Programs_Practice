package Java_Package_Practice;

public class Odd_Number {

    public void oddNumber()
    {
        int a [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int c : a)
        {
            if(c % 2 != 0)
            {
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
        Odd_Number obj = new Odd_Number();
        obj.oddNumber();
    }
}
