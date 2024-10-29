class Solution {
    
    public int[] solution(String s) {
        int[] a = new int[26]; 
        int[] b = new int[s.length()];

        for (int i = 0; i < 26; i++) {
            a[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (a[c] == -1) {
                b[i] = -1; 
            } else {
                b[i] = i - a[c];
            }
            a[c] = i;
        }
        return b;
    }
}