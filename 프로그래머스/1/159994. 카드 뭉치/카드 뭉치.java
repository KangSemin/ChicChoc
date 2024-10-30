class Solution {
    public String solution(String[] a, String[] b, String[] c) {
        int d=0,e=0;
        for(String s : c)
        {
            if(d<a.length && a[d].equals(s))
                d++;
            else if( e<b.length && b[e].equals(s) )
                e++;
            else
                return "No";
        }
        return "Yes";
    }
    
}