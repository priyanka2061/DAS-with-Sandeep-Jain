import java.util.ArrayList;
import java.util.List;

public class bracket {

    /**
     * @param n
     * @return
     */
    public List<String> AllParenthesis(int n) {
        // Write your code here
        List<String> list = new ArrayList<>();
        String s = "";

        if (n == 1) {
            list.add(s);
            return list;
        }
        solve(list, s, n, n);
        return list;
    }

    void solve(List<String> list, String output, int opening, int closing) {
        if (closing == 0 && opening == 0) {
            list.add(output);
            return;
        }
        if (opening > 0) {
            String t =  output+"(";
            solve(list, t, opening - 1, closing);
        }
        if (closing > opening) {
            String t = output + ")";
            solve(list, t, opening, closing - 1);
        }
    }

    public static void main(String args[]) {
        bracket obj = new bracket();
        int n = 3;
        obj.AllParenthesis(n);


    }
}