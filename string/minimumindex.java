package string;

import java.util.ArrayList;

public class minimumindex {

    // Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt) {
nhj        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < patt.length(); i++) {
            arr.add(patt.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if (arr.contains(str.charAt(i)))
            return i;
        }
        return -1;
    }

    public static void main (String args[])
    {
         String str = "geeksforgeeks";
        String patt = "set";
        System.out.println(minIndexChar(str,  patt));
    }   
}
