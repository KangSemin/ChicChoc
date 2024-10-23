class Solution {
    public double solution(int[] n) {      
        return n.length!=1 ? (double)(n[0]+n[n.length-1])/2:n[0];
    }
}