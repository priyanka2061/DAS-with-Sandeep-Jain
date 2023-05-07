import java.util.ArrayList;
import java.util.List;

public class binarywatch {

    static void solvem(String[] hours, List<String> output, int index, int turn) {
       StringBuilder k=new StringBuilder();
       k.append(hours[index]);
        String s = "0:0"+k;
        output.add(s);
        for (int i = index; i < hours.length; i++)
        {
            if (k.length() > turn) {

                break;
            }
        solvem(hours, output, index + 1, turn);
        output.remove(output.size() - 1);
        }
    }

    static void solve(String[] hours, List<String> output, int index, int turn) {

        StringBuilder p=new StringBuilder();
        p.append(hours[index]);
         String s = p+":00";
        output.add(s);
        for (int i = index; i < hours.length; i++)
        {
            if (p.length() > turn) {

                break;
            }
        solve(hours, output, index + 1, turn);
        output.remove(output.size() - 1);
        }
    }

    /**
     * @param turnedOn
     * @return
     */
    static public List<String> readBinaryWatch(int turnedOn) {
        List<String> outputh = new ArrayList<>();
        List<String> outputm = new ArrayList<>();
        String hours[] = { "1", "2", "4", "8" };
        String minuts[] = { "1", "2", "4","8", "16", "32" };
        if (turnedOn > 8) {
            return outputh;
        }
        solve(hours, outputh, 0, turnedOn);
        solvem(minuts, outputm, 0, turnedOn);
        outputm.addAll(outputh);
        for(String i:outputm)
        {
            System.out.println(i);
        }
        return outputm;

    }

    public static void main(String args[]) {
        readBinaryWatch(1);
    }
}
