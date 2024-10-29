class Solution {
    public String solution(int[] f) {
        String a = "";
        
        for(int i=1;i<f.length;i++)
        {
            for(int j=0;j<f[i]/2;j++)
            {
                a+=i;
            }
        }
        a+=0;
        
        for(int i=f.length-1;i>0;i--)
        {
            for(int j=0;j<f[i]/2;j++)
            {
                a+=i;
            }
        }
        
        return a;
    }
}