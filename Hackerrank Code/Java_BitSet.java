import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(m);
        
        for(int i=0; i<m; i++)
        {
            String ip = sc.next();
            switch(ip.charAt(0))
            {
                case 'A':
                {
                    if(sc.nextInt() == 1)
                    {
                        b1.and(b2);
                    }
                    else
                    {
                        b2.and(b1);
                    }
                }
                break;
                
                case 'O':
                {
                    if(sc.nextInt() == 1)
                    {
                        b1.or(b2);
                    }
                    else
                    {
                        b2.or(b1);
                    }
                }
                break;
                
                case 'X':
                {
                    if(sc.nextInt() == 1)
                    {
                        b1.xor(b2);
                    }
                    else
                    {
                        b2.xor(b1);
                    }
                }
                break;
                
                case 'F':
                {
                    if(sc.nextInt() == 1)
                    {
                        b1.flip(sc.nextInt());
                    }
                    else
                    {
                        b2.flip(sc.nextInt());
                    }
                }
                break;
                
                case 'S':
                {
                    if(sc.nextInt() == 1)
                    {
                        b1.set(sc.nextInt());
                    }
                    else
                    {
                        b2.set(sc.nextInt());
                    }
                }
                break;
            }
            
            System.out.println(b1.cardinality() + " " + b2.cardinality());
            
            if(sc.hasNextLine())
            {
                sc.nextLine();
            }
        }
    }
}
