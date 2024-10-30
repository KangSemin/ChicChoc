class Solution {
    public int solution(int n, int m, int[] b) {
        int a = 0;
        int[] c= new int[n+1];
        
        for(int i=0;i<b.length;i++)
        {
            if(c[b[i]]==0)
            {
                for(int j=b[i];j<b[i]+m;j++)
                {
                    if(j>n)break;
                    c[j]=1;
                }
                a++;
            }
            
        }
        
        
        return a;
    }
}