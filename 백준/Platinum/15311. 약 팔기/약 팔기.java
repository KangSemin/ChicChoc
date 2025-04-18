import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        sc.next();
        
        StringBuilder str = new StringBuilder();
        str.append("2000\n");
        for(int i = 0; i<1000; i++) str.append("1 ");
        for(int i = 0; i<1000; i++) str.append("1000 ");
        System.out.print(str);
    }
}