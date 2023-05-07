import java.util.HashSet;
import java.util.Set;

public class function {
    long count = 0;

    Set<Integer> set = new HashSet<>();

    void solve(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && s.charAt(i) % 2 != 0)
                return;
            if (i % 2 != 0) {
                if (!set.contains(s.charAt(i) - '0'))
                    return;
            }
        }
        count++;
    }

    public int countGoodNumbers(long n) {

        long m = 1000000007;
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);
        int j = 0;
        if (n == 0)
            return 0;
        while (n > 0) {
            j = (j * 10 + 9);
            n--;
        }
        String s = String.valueOf(j);
        j = 0;
        n = 0;
        while (s.length() > j) {
            if (s.charAt(j) == '0') {
                continue;
            }
            n = (n * 10) + s.charAt(j) - '0';
            j++;
        }
        if (n == 0)
            return 0;
        s = "";
        for (int i = 0; i <= n; i++) {
           
                s = String.valueOf(i);
                if ((s.charAt(0) - '0') % 2 == 0)
                    solve(s);
            }
        
        return (int) (count % m);

    }

    public static void main(String args[]) {
        function obj = new function();
        long n = 4;
        System.out.println(obj.countGoodNumbers(n));
    }
}