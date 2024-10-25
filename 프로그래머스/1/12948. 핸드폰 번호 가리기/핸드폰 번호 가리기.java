class Solution {
    public String solution(String a) {
        return "*".repeat(a.length() - 4) + a.substring(a.length() - 4, a.length());
    }
}