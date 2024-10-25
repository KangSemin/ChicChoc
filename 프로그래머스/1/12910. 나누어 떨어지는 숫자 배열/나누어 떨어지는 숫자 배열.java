import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] a = {};
        List<Integer> b = new ArrayList<>();
        for(int i : arr)
        {
            if(i % divisor == 0){
                b.add(i);
            }
        }
        if(b.isEmpty()) b.add(-1);
        a = b.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(a);
        return a;
    }
}