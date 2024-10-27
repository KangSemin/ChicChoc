class Solution {
    public int solution(int left, int right) {
        int a =0,c=0 ;
        for(int i=left;i<=right;i++)
        {
            for(int j=1;j<=i;j++)
            {
                c+= i%j==0 ? 1 : 0;
            }  
            a+=c%2==0? i :-i;
            c=0;
        }
        return a;
    }
}