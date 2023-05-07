import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class combination {

  static void solve(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp, ArrayList<Integer> A, int B,
  int index, int n) {
if (index >= n) {
  if (B == 0) {
    result.add(new ArrayList<>(temp));
  }
  return;
}
if (B >= A.get(index)) {
  temp.add(A.get(index));
  solve(result, temp, A, B - A.get(index), index, n);
  temp.remove(temp.size() - 1);
}

solve(result, temp, A, B, index + 1, n);

}
/**
 * @param A
 * @param B
 * @return
 */
static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
SortedSet<Integer>set=new TreeSet<>();
for(int i:A)
{
  set.add(i);
}

int current = 0;
int index = 0;
ArrayList<ArrayList<Integer>> result = new ArrayList<>();
ArrayList<Integer> temp = new ArrayList<>();
solve(result, temp, new ArrayList<>(set), B, index, A.size());
return result;
}


  public static void main(String args[]) {

    ArrayList<Integer> a = new ArrayList<>(Arrays.asList(8, 1, 8 ,6 ,8));

    combinationSum(a, 12);

  }

}
