import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        ArrayList<Integer> a = new ArrayList<>();
        
        for(int i=0; i<n; i++)
        {
            int ele = sc.nextInt();
            
            a.add(ele);
        }
        
        int q = sc.nextInt();
        
        for(int i=0; i<q; i++)
        {
            String query = sc.next();
            
            if(query.equals("Insert"))
            {
                int x = sc.nextInt();
                
                int y = sc.nextInt();
                
                a.add(x, y);
            }
            else
            {
                int x = sc.nextInt();
                
                a.remove(x);
            }
        }
        
        Iterator itr = a.iterator();
        
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
    }
}
