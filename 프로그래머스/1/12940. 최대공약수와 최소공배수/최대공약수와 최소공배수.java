class Solution {
    public int[] solution(int n, int m) {
        if(n>m)
        {
            int temp=n;
            n=m;
            m=temp;
        }
        int[] a={gcd(m,n),n*m/gcd(m,n)};
        return a;
    }
    
    int gcd(int a,int b)
    {
        int c;
        while(b>0)
        {
            c=a%b;
            a=b;
            b=c;
        }
        return a;
    }
}