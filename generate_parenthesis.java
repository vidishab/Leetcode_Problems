import java.util.ArrayList;
import java.util.List;

public class generate_parenthesis {
    static List generate(int n)
    {
        List<String> s = new ArrayList<>();
        gen(n,s,"",n,0);
        return s;
    }
    static void gen(int n,List<String> s, String res,int left,int right)
    {
        if(res.length()==n*2)
        {
            s.add(res);
            return;
        }
        if(left>0)
        {
            String res1=res+'(';
            gen(n,s,res1,left-1,right+1);

        }
        if(right>0)
        {
            String res1=res+')';
            gen(n,s,res1,left,right-1);
        }

    }
    public static void main(String args[])
    {
        System.out.println(generate(3));
    }
}

