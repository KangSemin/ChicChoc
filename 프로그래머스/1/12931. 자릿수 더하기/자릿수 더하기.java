import java.util.*;

public class Solution {
    public int solution(int n) {
        
        int a=0;
        while(n>0)
        {
            a+= n%10;
            n/=10;
        }
        
        return a;
    }
}