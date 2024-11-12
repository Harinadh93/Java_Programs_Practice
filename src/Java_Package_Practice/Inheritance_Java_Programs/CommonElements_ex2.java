package Java_Package_Practice.Inheritance_Java_Programs;

public class CommonElements_ex2
 {
    public static void main(String[] args) {
    String [] array1 = {"abc", "def", "ghi", "jkl"};

    String [] array2 = {"def", "mno", "abc", "pqr"};

    for(int i = 0; i < array1.length; i++)
    {
        for (int j = 0; j < array2.length; j++)
        {
            if(array1[i].equals(array2[j]))
            {
                System.out.println(array1[i]);
            }
        }
    }
}
 }

 



