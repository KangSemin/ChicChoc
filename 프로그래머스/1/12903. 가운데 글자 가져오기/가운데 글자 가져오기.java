class Solution {
    public String solution(String s) {
        String a = "";
        int b = s.length() / 2;

        a = s.length() % 2 == 0 ? s.substring(b-1, b+1) : s.substring(b, b+1);

        return a;
    }
}