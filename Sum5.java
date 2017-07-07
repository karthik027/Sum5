# Sum5
import java.io.*;
import java.util.*;
public class Sum5
{
  public static void main(String args[])throws IOException
  {
    int n,a=0,b,c=0,d,e=0,f=0,g;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input:");
    n=Integer.parseInt(br.readLine());
    if(n==0)
    {
      System.out.println("Enter a value greaterthan 9");
    }
    else
    {
      a=n%10;
      b=n/10;
      c=b%10;
      d=b/10;
      e=d%10;
      f=d/10;
      
      g=((f)+(f+e)+(f+e+c)+(f+e+c+a));
         
      System.out.println("The sum of digits is:"+g);
    }
    
  }
}
