package string;

class dot {

   static String reverseWords(String s) {

      // initially reversing individual words of the given
      // string one by one and storing it in a list.
      String words[] = s.split("k");
      String result = "";

      // now reversing the whole modified string by adding all
      // the elements of list in a single string in reverse order.
      for (int i = words.length - 1; i >= 0; i--) {
         result += words[i];
         if (i != 0)
            result += '.';
      }
      // returning the result.
      return result;
   }

   public static void main(String args[]) {
      String S = "priyanka.kumari";
      System.out.println(reverseWords(S));
   }
}