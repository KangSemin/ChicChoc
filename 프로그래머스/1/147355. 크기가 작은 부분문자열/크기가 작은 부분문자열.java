class Solution {
    public int solution(String t, String p) {
        int a = 0; 
        for(int i=0;i<=t.length()-p.length();i++)
            if(Long.parseLong(t.substring(i,i+p.length()))<=Long.parseLong(p)) a++;        
        return a;
    }
}