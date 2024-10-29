import java.util.*;
class Solution {
    public List<Integer> solution(int[] n) {
        
        List<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(a.contains(n[i]+n[j])) continue;
                a.add(n[i]+n[j]);    
            }
        }
        Collections.sort(a);
        return a;
    }
}