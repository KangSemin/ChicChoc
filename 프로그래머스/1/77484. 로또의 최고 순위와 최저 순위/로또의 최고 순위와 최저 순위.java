class Solution {
    public int[] solution(int[] c, int[] d) {
        int[] a= {7,7} ;
        
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==0)
            {
                a[0]--;
                continue;
            }
            for(int j=0;j<c.length;j++)
            {
                if(c[i]==d[j]) 
                {
                    a[0]--;
                    a[1]--;
                    break;
                }
                
            }
        }
    
        a[0]= a[0]>6? 6: a[0];
        a[1]= a[1]>6? 6: a[1];
        
        return a;
    }
}