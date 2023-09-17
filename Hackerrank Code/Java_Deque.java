    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            
            HashSet<Integer> hs = new HashSet<>();
            
            int max = -1;
            
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num);
                hs.add(num);
                   
                if(deque.size() == m)
                {
                    if(hs.size() > max)
                    {
                        max = hs.size();
                    }
                    
                    int first = (int) deque.remove();
                    
                    if(!deque.contains(first))
                    {
                        hs.remove(first);
                    }
                }
            }
            System.out.println(max);
        }
    }
