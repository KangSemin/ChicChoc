class Solution {
    public int solution(int k, int m, int[] a) {
        int[] b = new int[k+1];
        int c=0, d=0;  
        for(int i=0; i<a.length; i++) b[a[i]]++;
        for(int i=k; i>0; i--){ 
            b[i]=b[i] + d;      
            c += b[i]/m * m * i;
            d = b[i]%m;        
        }
        return c;
    }
}
