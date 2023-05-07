public class substring {

    
    static int strstr(String s, String x) {
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            if (j < x.length() && s.charAt(i) == x.charAt(j)) {
                i++;
                j++;
            } else if (j == x.length())
                return i - j ;
            else {
                // i=i-j;
                i=i-j+1;
                j = 0;
            }

        }
        if(j==x.length())
        {
            return i - j;
        }
        return -1;
    }

    public static void main(String args[]) {
        String s = "abcabcabcd";
        String x = "abcd";
        System.out.println(strstr(s, x));
    }
}
