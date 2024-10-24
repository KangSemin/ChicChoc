import java.util.*;

public class Solution {
    public boolean solution(int n) {
        int temp=n;
        
        int a=0;
        while(n>0)
        {
            a+= n%10;
            n/=10;
        }
        
        return temp%a==0 ? true : false ;
    }
}