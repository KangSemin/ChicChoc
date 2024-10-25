class Solution {
    public int[] solution(int[] a) {
        
        int[] b;
        if(a.length==1)
        {
            b= new int[]{-1};
            return b;
        }
        else
        {
            b= new int[a.length-1];
            int s = 0 ;
            for(int i=0;i<a.length;i++)
            {
                if( a[s] > a[i] ) s=i;
            }
            for(int i=0,j=0;i<a.length;i++)
            {
                if(i!=s)b[j++]=a[i];
            }
            
        }
        
        
        return b;
    }
}