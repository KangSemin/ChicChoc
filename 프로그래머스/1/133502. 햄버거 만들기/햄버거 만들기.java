import java.util.Stack;
class Solution {
    public int solution(int[] b) {
        int a = 0;
        Stack<Integer> s= new Stack<>() ;
        s.push(0);
        
        for(int i=0;i<b.length;i++){
            if(s.peek()==3 && b[i]==1){
                s.pop();
                s.pop();
                s.pop();
                a++;
            }
            else if(b[i]==1 || b[i] ==s.peek()+1)
                s.push(b[i]);
            else
            {
                s.clear();
                s.push(0);
            }
         }  
         return a;
    }
} 