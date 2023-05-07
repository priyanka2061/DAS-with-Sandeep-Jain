package string;

public class joinm
{

   public static void main (String args[]) 
   {
    String words[]={"priyanka","kumar","kr","rt"};
    String s="priyanka";
    String[] sk=s.split("k");
    String str = String.join(" ", words);
    System.out.println(str);


   }

}