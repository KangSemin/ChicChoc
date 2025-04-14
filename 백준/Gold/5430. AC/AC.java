import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            int[] x = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine(),"[,]");
            for (int j = 0; j < n; j++) {
                x[j]= Integer.parseInt(st.nextToken());
            }
            test(p,x);
        }

        System.out.print(sb);
    }

    private static void test(String p, int[] x) {
        int l =0, r= x.length-1;
        boolean dir = true;

        for (char j : p.toCharArray()) {
            switch (j) {
                case 'R' :
                {
                    dir= !dir;
                    break;
                }
                case 'D' :
                {
                    if (dir) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }

        if (l-1 > r) {
            sb.append("error\n");
            return;
        }

        sb.append("[");
        if (dir) {
            for (int i = l; i <= r; i++) {
                sb.append(x[i]);

                if(i<r)
                    sb.append(',');
            }
        }else {
            for (int i = r; i >= l; i--) {
                sb.append(x[i]);
                if (i>l)
                    sb.append(',');
            }
        }
        sb.append("]\n");
    }
}