package Java_Package_Practice.Java_Programs_Practice_04112024;

public class CommonElements {

    public static void main(String[] args) {
        String [] array1 = {"abc", "def", "abc", "def", "ghi"};

        for(int i = 0; i < array1.length; i++)
        {
            for(int j = i+1; j < array1.length; j++)
            {
                if(array1[i].equals(array1[j]))
                {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
