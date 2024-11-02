class Solution {
    public int solution(String s) {
        
        int[] a ={0,0};
        char b ='1';
        int d=0;
        
        for(char c : s.toCharArray() )
        {
            if(a[0]==0)
            {
                b=c;
                a[0]++;
            }
            else if(b==c) a[0]++;
            else a[1]++;
            if(a[0]==a[1])
            {
                d++;
                a[0]=0;
                a[1]=0;
            }
        }
        if(a[0]>0) d++;
        
        return d;
    }
}