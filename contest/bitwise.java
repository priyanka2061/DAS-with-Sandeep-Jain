public class bitwise {

    /**
     * @param s
     * @param target
     * @return
     */
    public static boolean makeStringsEqual(String s, String target) {
        char p='0';
        // StringBuffer st=new StringBuffer(s);
        String st="";
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k) == target.charAt(k) && target.charAt(k) == '1' && s.charAt(k) == '1') {
                p='1';
                break;
            }
        }
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != target.charAt(i)) {
                st +=  s.charAt(i) ^p;

            } else {
                st += s.charAt(i);
            }
        }

        if (st.equals(target))
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        String s = "1010", target = "0110";
        System.out.println(makeStringsEqual(s, target));

    }
}
