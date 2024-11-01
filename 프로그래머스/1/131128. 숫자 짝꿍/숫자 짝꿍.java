import java.util.*;
class Solution {
    public String solution(String x, String y) {
        StringBuilder a = new StringBuilder();
        String c ;
        int[][] b= new int [2][10];  
        Count(x,b[0]);
        Count(y,b[1]);
        for(int i=9;i>=0;i--)
        {
            while(b[0][i]>0 && b[1][i]>0)
            {
                a.append(i);
                b[0][i]--;
                b[1][i]--;
            }
        }
        c= a.toString();
        if( c.isEmpty()) c="-1";
        else if(c.charAt(0)=='0') c="0";
        
        return c;
    }
    
    public void Count(String a,int[] b)
    {
        for (int i = 0; i < a.length(); i++)
            b[a.charAt(i) - '0']++;
    }
}