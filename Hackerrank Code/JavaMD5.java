import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        String message = sc.nextLine();
        
        sc.close();
        
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            
            messagedigest.update(message.getBytes());
            
            byte[] hash = messagedigest.digest();
            
            for(byte b : hash)
            {
                System.out.printf("%02x", b);
            }
        }
        
        catch(Exception e)
        {
            
        }
    }
}
