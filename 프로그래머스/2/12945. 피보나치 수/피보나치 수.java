class Solution {
    public long solution(int n) {
            
            long[] b = new long[n+1];
            b[1]=1;
            return fibo(n,b)%1234567;
        }
        public long fibo(int a,long[] b)
        {

            if(b[a]==0 && a>1) b[a] = fibo(a-1,b)+fibo(a-2,b);
            if(b[a]>1234567)b[a]-=1234567;
            
            return b[a];
        }
}