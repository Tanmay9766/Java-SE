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

class countingSort {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public countingSort(int[] array, int size) {
    // Write your code here
    
        int[] count = new int[100];
               
        Arrays.fill(count, 0);
        
        for(int i=0; i<size; i++)
        {
           int element = array[i];
            
            count[element]++;
        }
        
        for(int i=0; i<100; i++)
        {
            System.out.print(count[i] + " ");
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        countingSort rs = new countingSort(arr, size);        
    }
}
