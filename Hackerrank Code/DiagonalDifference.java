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

class difference_diagonal {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public difference_diagonal(int arr[][], int size) {
    // Write your code here
    
    int left = 0, right = 0;
    
        for(int i=0; i<size; i++)
        {
            left = left + arr[i][i];   
        }
        
        for(int i=0, j=size-1; i<size && j>=0; i++, j--)
        {
            right = right + arr[i][j];
        }
        
        System.out.println(Math.abs(left - right));
    }

}

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        
        int arr[][] = new int[size][size];
        
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        difference_diagonal obj = new difference_diagonal(arr, size);
    }
}
