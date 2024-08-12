package PrefixString;

public class GreatestCommonDivisorOfStrings {

    public String solution(String str1, String str2) {
        // Check if concatenated strings are equal or not, if not return ""
        if (!(str1 + str2).equals(str2 + str1)) return "";

        // If strings are equal than return the substring from 0 to gcd of size(str1), size(str2)
        int gcd = greatestDivisor(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private int greatestDivisor(int a, int b) {
        return b == 0 ? a : greatestDivisor(b, a % b);
    }
}
