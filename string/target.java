package string;

public class target {
  static public int closetTarget(String[] words, String target, int startIndex) {

    int flag = 0;
    int flag2 = 0;
    int n = words.length;
    int start = 0;
    int end = 0;
    int i=startIndex;
  
   while((i+1)%n) {
      start++;
      if (words[(i + 1) % n].equals(target)) {
        flag = 1;
        break; 
      }
     i++;
    }
   i=startIndex;
      while((i-1+n)%n) {
        end++;
        if (words[(i - 1 + n) % n].equals(target)) {
          flag2 = 1;
          break;
  
        }
    }
 
  }

    if (flag == 1 && flag2 == 1)
      return Math.min(start, end);
    else if (flag == 1)
      return start;
    else if (flag2 == 1)
      return end;
    return -1;

  }
  public static void main(String args[]) {
    String[] words = {"hsdqinnoha","mqhskgeqzr","zemkwvqrww","zemkwvqrww"
    ,"daljcrktje","fghofclnwp","djwdworyka"
    ,"cxfpybanhd","fghofclnwp","fghofclnwp" };
    int index = 8;
    String target = "zemkwvqrww";
    System.out.println(closetTarget(words, target, index));
  }
}