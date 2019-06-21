public class longest_palindrome {
    static void find(String str)
    {
        int max_len=1;
        int n=str.length();
        boolean table[][]=new boolean[n][n];
        for(int i=0;i<n;i++)
        {
            table[i][i]=true;
        }
        int start=0;
        for(int i=0;i<n-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                table[i][i+1]=true;
                start=i;
                max_len=2;
            }
        }
        for(int k=3;k<=n;k++)
        {
            for(int i=0;i<n-k+1;i++)
            {
                int j=i+k-1;
                if(table[i+1][j-1] && str.charAt(i)==str.charAt(j))
                {
                   table[i][j]=true;
                   if(k > max_len)
                   {
                       max_len=k;
                       start=i;
                   }
                }
            }
        }
        System.out.println(max_len);
        System.out.println(str.substring(start,start+max_len));
    }
    public static void main(String args[])
    {
        String str="forgeeksskeegfor";
        find(str);
    }
}

