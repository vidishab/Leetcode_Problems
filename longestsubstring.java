public class longestsubstring {
    static final int NO_OF_CHARS=256;
    static void check(String str)
    {
        int pre_index;
        int curr_len=1;
        int max_len=1;
        int n=str.length();
        int visited[]=new int[NO_OF_CHARS];
        for(int i=0;i<n;i++)
        {
            visited[i]=-1;
        }
        visited[str.charAt(0)]=0;
        for(int i=1;i<n;i++)
        {
            pre_index=visited[str.charAt(i)];
            if(pre_index==-1 || i-curr_len > pre_index)
                curr_len++;
            else
            {
                if(curr_len > max_len)
                    max_len=curr_len;
                curr_len=i-pre_index;
            }
            visited[str.charAt(i)]=i;
        }
        if(curr_len > max_len)
            max_len=curr_len;
        System.out.println(max_len);

    }
    public static void main(String args[])
    {
        String str="ABDEFGABEF";
        check(str);
    }
}

