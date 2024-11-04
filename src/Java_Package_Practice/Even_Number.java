package Java_Package_Practice;

public class Even_Number {

    public void evenNumber()
    {
        int a [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int c : a)
        {
            if(c % 2 == 0)
            {
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
        Even_Number obj = new Even_Number();
        obj.evenNumber();
    }
}
