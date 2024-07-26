package Solutions.easy;

public class ReverseString {
    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
    }

    public static void reverseString(char[] s) {
        for (int i =0;i<s.length/2;i++)
        {
            char t = s[s.length-i-1];
            s[s.length-i-1] = s[i];
            s[i] = t;
        }
    }
}
