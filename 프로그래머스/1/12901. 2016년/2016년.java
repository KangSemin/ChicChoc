class Solution {
    public String solution(int a, int b) {
        String[] c = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] d = {31,29,31,30,31,30,31,31,30,31,30,31};
        int e=0;
        for(int i=0;i<a-1;i++)
            e+=d[i];
            
        return c[((e+b-1)%7)];
    }
}