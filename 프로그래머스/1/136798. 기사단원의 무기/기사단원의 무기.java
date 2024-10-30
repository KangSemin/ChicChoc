class Solution {
    public int solution(int n, int c, int d) {
        int a=0;
        int[] b= new int[n];
        
        for(int i=1;i<=n;i++)
        {
            b[i-1]=MeasureNum(i);
        }
        for(int i=0;i<n;i++)
        {
            if(b[i]>c) a+=d;
            else a+=b[i];
        }
        
        return a;
    }
    
    public int MeasureNum(int a)
    {
        int b=0;
        for(int i=1;i*i<=a;i++)
        {
            if(i*i==a) b++;
            else if(a%i==0) b+=2;
        }
        return b;
    }
}