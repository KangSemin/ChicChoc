class Solution {
    public String solution(int n) {
        
        String a ="";
        
        for(int i=0;i<n;i++)
        {
            a+= i%2==0? "수":"박";
        }
        
        return a;
    }
}