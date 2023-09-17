import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
        int n=sc.nextInt();
		
        sc.nextLine();
        
        Map<String,Integer> map = new HashMap<>(n);
        
		for(int i=0;i<n;i++)
		{
			String name=sc.nextLine();
			
            int phone=sc.nextInt();
			
            sc.nextLine();
            
            map.put(name, phone);
		}
		while(sc.hasNext())
		{
			String toFind=sc.nextLine();
    
            try
            {
                int phone = map.get(toFind);
                
                System.out.println(toFind + "=" + phone);
            }
            catch(Exception e)
            {
                System.out.println("Not found");
            }
        }
	}
}
