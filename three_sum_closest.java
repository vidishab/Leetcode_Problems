import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class three_sum_closest {
    static void find(int nums[],int target)
    {
        //int res=0;
        int min_sum=Integer.MAX_VALUE;
        int max_val=Integer.MIN_VALUE;
        int min_val=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    int res=nums[i]+nums[j]+nums[k];
                    System.out.println("Res value: " + res);
                    //min_val=Math.abs(res-target);
                    if( target > 0 && Math.abs(res-target) < min_val)
                    {
                        min_val=Math.abs(res-target);
                        //System.out.println(min_sum + " " + res);
                        min_sum=res;
                    }
                   else if( target < 0 && Math.abs(res+target) < min_val)
                    {
                        min_val=Math.abs(res+target);
                        System.out.println(min_sum + " " + res);
                        min_sum=res;
                    }

                }
            }
        }
    }
    public static void main(String args[])
    {
        int nums[]=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target=sc.nextInt();
        find(nums,target);
    }
}

