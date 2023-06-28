
/*An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
For example, “abcd” and “dabc” are an anagram of each other.*/

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    static boolean areAnagram(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        char[] ch1 = new char[n1];
        char[] ch2 = new char[n1];
        if (n1 != n2)
            return false;
        for (int i = 0; i < str1.length(); i++) {
            ch1[i] = str1.charAt(i);
            ch2[i] = str2.charAt(i);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < n1; i++)
            if (ch1[i] != ch2[i])
                return false;
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1:");
        String str1 = sc.next();
        System.out.println("Enter String2:");
        String str2 = sc.next();
        if (areAnagram(str1, str2))
            System.out.println("The two strings " + str1 + " and " + str2 +
                    " are anagram for each other");
        else
            System.out.println("The two strings " + str1 + " and " + str2 +
                    " are not anagram for each other");
        sc.close();
    }
}
