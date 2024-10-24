class Solution {
    public long[] solution(int x, int n) {
        long[] a = new long[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=(long)x*(i+1);
        }
        
        return a;
    }
}