package Java_Package_Practice;

public class Reverse_String {

    public static void main(String[] args) {
        String s = "Sai Ashok";
        char [] chars = s.toCharArray();
        String reverse = "";

        for(int i = chars.length - 1; i >= 0; i--)
        {
            reverse = reverse + chars[i];
        }

        System.out.println("The Reverse String is: "+reverse);
    }
}
