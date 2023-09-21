import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException{
        
        Scanner sc = new Scanner(System.in);
        
        MessageDigest m = MessageDigest.getInstance("SHA-256");
        
        m.reset();
        
        m.update(sc.nextLine().getBytes());
        
        for(byte i : m.digest())
        {
            System.out.print(String.format("%02x", i));
        }
        
        System.out.println();
    }
}
