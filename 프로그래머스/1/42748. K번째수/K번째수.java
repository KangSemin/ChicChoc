class Solution {
    public int[] solution(int[] a, int[][] b) {
        int[] c = new int[b.length];
        int cnt=0;
        for(int i=0;i<b.length;i++)
        {
            int[] d = new int[b[i][1]-b[i][0]+1];
            for(int j=b[i][0]-1,k=0;j<b[i][1];j++,k++)
            {
                d[k]=a[j];
            }
            Sort(d);
            c[cnt++]=d[b[i][2]-1];
        }
        
        
        return c;
    }
    
    
    public void Sort(int[] a)
    {
        
        int temp =0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        

    }
    
}