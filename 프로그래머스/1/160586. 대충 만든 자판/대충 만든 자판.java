import java.util.*;

class Solution {
    public int[] solution(String[] b, String[] e) {
        
        HashMap<Character,Integer> a = new HashMap<>();
        int[] d = new int[e.length];
        
        for( int i=0;i<b.length;i++)
        {
            int cnt=1;
            for(char c : b[i].toCharArray())
            {
                if(!a.containsKey(c)) a.put(c,cnt);
                else if(a.get(c)>cnt) a.replace(c,cnt);
                cnt++;
            }
        }
        for(int i=0;i<e.length;i++)
            
            for(char c:e[i].toCharArray())
            {
                if(a.containsKey(c)) d[i]+= a.get(c);
                else
                {
                    d[i]=-1;
                    break ;
                }
            
        }
        
        return d;
    }
}