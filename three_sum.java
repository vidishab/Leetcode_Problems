
import java.util.*;

public class three_sum {
    static List<List<Integer>> res;
    static ArrayList<Integer> arr;
    static Hashtable<ArrayList,Integer> ht;
    static void find(int nums[])
    {
         res = new ArrayList<>();
         arr = new ArrayList<Integer>();
         ht = new Hashtable<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if((nums[i] + nums[j] + nums[k]) == 0)
                    {
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        Collections.sort(arr);
                        System.out.println(arr);
                        if(ht.contains(arr))
                        {
                            continue;
                        }
                        else
                            {
                                ht.put(arr,1);
                                System.out.println(ht);
                            }
                            arr.clear();
                    }
                }
            }
        }
        System.out.println(ht);

    }
    static void merge(int nums[],int temp[],int low,int mid,int high)
    {
        int temp_pos,size,left_end;
        left_end=mid-1;
        temp_pos=low;
        size=high-low+1;
        while ((low<=left_end) && (mid <= high))
        {
            if(nums[low]<=nums[mid])
            {
                temp[temp_pos]=nums[low];
                temp_pos+=1;
                low+=1;
            }
            else
            {
                temp[temp_pos]=nums[mid];
                temp_pos+=1;
                mid+=1;
            }
        }
        while (low<=left_end)
        {
            temp[temp_pos]=nums[low];
            temp_pos+=1;
            low+=1;
        }
        while (mid<=high)
        {
            temp[temp_pos]=nums[mid];
            temp_pos+=1;
            mid+=1;
        }
        for(int i=0;i<size;i++)
        {
            nums[high]=temp[high];
            high-=1;
        }

    }
    static void sort(int nums[],int temp[],int low,int high)
    {
        int mid;
        if(high > low)
        {
            mid=(high+low)/2;
            sort(nums,temp,low,mid);
            sort(nums,temp,mid+1,high);
            merge(nums,temp,low,mid+1,high);
        }
    }
    public static void main(String args[])
    {
        int nums[]={-1, 0, 1, 2, -1, 4};
        int temp[]=new int[nums.length];
        sort(nums,temp,0,nums.length-1);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
        find(nums);
    }
}

