class Solution {
    public int[] solution(String[] b, String[] e) {
        int[] a = new int[26];
        int[] d= new int[e.length];
        
        for( int i=0;i<b.length;i++)
        {
            int cnt=1;
            for(char c : b[i].toCharArray())
            {
                if(a[c-'A']>cnt || a[c-'A']==0) a[c-'A']=cnt;
                cnt++;
            }
        }
        
        for(int i=0;i<e.length;i++)
        {
            for(char c:e[i].toCharArray())
            {
                if(a[c-'A']!=0)d[i]+= a[c-'A'];
                else
                {
                    d[i]=-1;
                    break;
                }
                
            }
        }
        
        return d;
    }
}