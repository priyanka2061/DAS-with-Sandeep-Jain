import java.util.*;
import java.io.*;

public class a {
    public static String sol(String str) {
        int n = str.length();
        if (n < 1) {
            return str;
        }
        if (str.charAt(n - 1) != '1' && str.charAt(n - 1) != '2' && str.charAt(n - 1) != '3' && str.charAt(n - 1) != '4'
                && str.charAt(n - 1) != '5' && str.charAt(n - 1) != '6' && str.charAt(n - 1) != '7'
                && str.charAt(n - 1) != '8' &&
                str.charAt(n - 1) != '9'
                && str.charAt(n - 1) != '0') {
            str = str.substring(0, n - 1);
            return sol(str);
        } else {
            char last = str.charAt(n - 1);
            str = str.substring(0, n - 1);
            return sol(str) + last;
        }
    }

    public static int myatoi(String str) {
        int sign = 1;
        if (str.charAt(0) == '-') {
            sign = -1;
        }
        String ans = "";
        ans = sol(str);
        int res = 0;
        System.out.println(ans);
        for (int i = 0; i < ans.length(); i++) {
            res = (res * 10) + ans.charAt(i) - '0';
        }
        return res * sign;
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine(); 
        System.out.println(myatoi("-abd123"));
    }
}
