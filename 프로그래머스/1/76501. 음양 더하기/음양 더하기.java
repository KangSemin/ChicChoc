class Solution {
    public int solution(int[] a, boolean[] b) {
        
        int s=0;
        for(int i=0; i<a.length ;i++)
        {
            s += b[i] ? a[i] : -a[i];
        }
        return s;
    }
}