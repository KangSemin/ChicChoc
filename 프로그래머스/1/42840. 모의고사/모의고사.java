import java.util.*;
class Solution {
    public List<Integer> solution(int[] a) {
        int[][] b ={ {1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5} };
        int[] c = new int[3] ;
        int d=0;
        List<Integer> e = new ArrayList<>();
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<3;j++)
            {                
                if(b[j][i%b[j].length]==a[i])
                    c[j]++;
            }
        }
        for(int i=0;i<3;i++)
            if(c[i]>d) d=c[i];
        for(int i=0;i<3;i++)
            if(c[i]==d) e.add(i+1);
        
        return e;
    }
}