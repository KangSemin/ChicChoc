class Solution {
    public int solution(String s) {
        String[] a = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] b = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            s = s.replace(b[i], a[i]);
        }
        return Integer.parseInt(s);
    }
}