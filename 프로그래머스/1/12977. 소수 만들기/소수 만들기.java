import java.util.*;

class Solution {
    public int solution(int[] n) {
        int a =0;
        List<Integer> b= new ArrayList<Integer>();

        for(int i=0;i<n.length-2;i++)
        {for(int j=i+1;j<n.length-1;j++)
          {for(int k=j+1;k<n.length;k++)
            {
              if(IsPrime(n[i]+n[j]+n[k],b))
                  a++;
            }
          }
        }
        return a;
    }
    public boolean IsPrime(int a, List<Integer> b)
    {
        if(b.contains(a)) return true;
        
        for(int i=2;i*i<=a;i++)
        {
            if(a%i==0) return false;
        }
        b.add(a);
        return true;
    }
}