import java.util.*;
class Solution {
    public int solution(int n, int[] b, int[] c) {
        HashSet<Integer> d = new HashSet<>();
        HashSet<Integer> e = new HashSet<>();
        for(int i : c)
            d.add(i);
        for(int i : b)
        {
            if(d.contains(i)) d.remove(i);
            else e.add(i);
        }
        for(int i : d)
        {
            if(e.contains(i-1)) e.remove(i-1);
            else if(e.contains(i+1)) e.remove(i+1);
        }
        return n- e.size();
    }
}