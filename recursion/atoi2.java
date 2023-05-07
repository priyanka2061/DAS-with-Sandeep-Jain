public class atoi2 {
    int flag=1;
    int out=0;
    int i=0;
    int atoi(String str) {
	// Your code here
	if(str.length()==0)
    	return -1;
	if(i==0 && str.charAt(0)=='-')
	{
	    flag=-1;
	    i++;
	    
	}
	if(str.length()-1<i)
	{
	    return out*flag;
	}
	if(!(str.charAt(i)>='0' && str.charAt(i)<='9'))
	{
	   return -1;
	}

   out=out*10+str.charAt(i)-'0';
   i++;
   return atoi(str);
}
public static void main(String args[])
{
    atoi2 obj=new atoi2();
    String s="-12";
    System.err.println(obj.atoi(s));
    
}
}