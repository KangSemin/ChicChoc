import java.util.*;

class Solution {
    public String[] solution(String[] s, int n) {
        String[] a = new String[s.length];
        List<String> b = new ArrayList<>();
        
        for (int i = 0; i < s.length; i++) {
            b.add(s[i].charAt(n) + s[i]);
        }
        Collections.sort(b);
        
        for (int i = 0; i < b.size(); i++) {
            a[i] = b.get(i).substring(1, b.get(i).length());
        }
        return a;
    }
}