import java.util.StringTokenizer; 
public class Simple{  
	public static void main(String args[])
	{  
	StringTokenizer st = new StringTokenizer("my na/me is/ kha/n","/");  
			while (st.hasMoreTokens()) 
			{  
			System.out.println(st.nextToken()); 
			System.out.println(st.countTokens());		 
			}  
   }  
}  