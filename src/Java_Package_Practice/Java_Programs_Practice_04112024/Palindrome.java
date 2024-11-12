package Java_Package_Practice.Java_Programs_Practice_04112024;

public class Palindrome {

    public static void main(String[] args) {
        String s = "mom";
        char [] chars = s.toCharArray();
        String reverse = "";

        for(int i = chars.length - 1; i >= 0; i--)
        {
            reverse = reverse + chars[i];
        }
        System.out.println(reverse);
        if(s.equals(reverse))
        {
            System.out.println("Given String is Palindrome");
        }
        else
        {
            System.out.println("Given String is not Palindrome");
        }
    }
}
