import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       // String n = bufferedReader.readLine();
        
        BigInteger n = new BigInteger(sc.next());
        
        sc.close();
        
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}
