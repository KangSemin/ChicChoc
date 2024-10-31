import java.util.*;

class Solution {
    public int solution(String[] b) {
        int d = 0;

        HashMap<String, Integer> a = new HashMap<>();
        a.put("aya", 0);
        a.put("ye", 0);
        a.put("woo", 0);
        a.put("ma", 0);

        for (int i = 0; i < b.length; i++){
            String[] c = {"",""};

            for (int j = 0; j < b[i].length(); j++){
                c[0] += b[i].charAt(j);

                if ( !c[1].equals(c[0]) && a.containsKey(c[0]))
                {
                    c[1] = c[0];
                    c[0] = "";
                }
            }

            if (c[0].isEmpty()) d ++;
        }



        return d;

    }
}