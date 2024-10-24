class Solution {
    public int solution(int num) {
        int cnt=0;

        return collatz(num,cnt);
        
        
    }
    
    
    public int collatz(int num, int cnt)
    {
        if(cnt>=500) return -1;
        if(num==1)
        {
            return cnt;
        }
        else if(num%2==1)
        {
            return collatz(num*3+1,++cnt);
        }
        else
        {
            return collatz(num/2,++cnt);
        }
        
    }
}

