class Solution {
    public int solution(int[][] s) {
        int a =0, b=0;
        int c;
        
        for(int i=0;i<s.length;i++)
        {
            if(s[i][0]>s[i][1])
            {
                c=s[i][0];
                s[i][0]=s[i][1];
                s[i][1]=c;
            }
            if(a<s[i][0]) a=s[i][0];
            if(b<s[i][1]) b=s[i][1]; 
        }
        return a*b;
    }
}