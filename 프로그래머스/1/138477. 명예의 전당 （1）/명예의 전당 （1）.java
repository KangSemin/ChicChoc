class Solution {
    public int[] solution(int k, int[] s) {
        int[] a = new int[s.length];
        int[] b = new int[k];
        
        for(int i=0;i<s.length;i++)
        {
            if(b[0]<=s[i])
                b[0]=s[i];
            Sort(b);
            
            if(k-1>0)
            {
                a[i]=b[k-1];
                k--;
                continue;
            }
            a[i]=b[0];
        }
        
        
        return a;
    }
    
    public void Sort(int[] a)
    {
        int temp;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j= i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}