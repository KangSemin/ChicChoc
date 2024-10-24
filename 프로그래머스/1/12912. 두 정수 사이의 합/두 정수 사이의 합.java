class Solution {
    public long solution(int a, int b) {
        
        
        
        return a==b? a: a>b? (long)(a+b)*(a-b+1)/2 : (long)(a+b)*(b-a+1)/2 ;
    }
}