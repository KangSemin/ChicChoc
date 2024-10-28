class Solution {
    public String solution(String s) {
        String a="";
        char[] c=s.toCharArray();
        boolean b = false;
        for(int i=0;i<c.length;i++)
        {
            if(b && c[i]<95 && c[i]!=32) a+=(char)(c[i]+32);
            else if(!b && c[i]>95 ) a+=(char)(c[i]-32);
            else
            {
                a+=c[i];
                if(c[i]==32) b= true;
            }
            b= !b;
        }
        return a;
    }
}