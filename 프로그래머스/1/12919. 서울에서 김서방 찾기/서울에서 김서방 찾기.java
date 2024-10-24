class Solution {
    public String solution(String[] ss) {
        
        String s = new String();
        for(int i=0; i<ss.length; i++ )
        {
            if(ss[i].equals( "Kim"))
            {
                s= "김서방은 "+i+"에 있다";
                break;
            }
        }
        
        return s;
    }
}