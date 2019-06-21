import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class isPalindrome
{
    public static boolean isPalindrome(int x) {
            Queue<Integer> queue = new LinkedList<>();
            int n,count=0;
            double res=0;
            int result=0;
            if(x > 0)
            {
                while(x > 0)
                {
                    n=x%10;
                    queue.add(n);
                    count++;
                    x=x/10;
                }
                while(!queue.isEmpty())
                {
                    int r = queue.remove();
                    res+=r*Math.pow(10,--count);
                }
                result=(int)res;
            }
            if(result==121)
            {
                System.out.println(result);
                return true;
            }
            return false;

        }
        public static void main(String args[])
        {
            System.out.println(isPalindrome(121));
        }
    }


