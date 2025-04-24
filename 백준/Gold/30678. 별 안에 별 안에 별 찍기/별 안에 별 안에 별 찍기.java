import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CountingStar c = new CountingStar();
        c.Start();

    }

}

class CountingStar {

    int n = new Scanner(System.in).nextInt();
    int size = Power5(n);
    boolean[][] bluePrint= {{false,false,true,false,false}
        ,{false,false,true,false,false}
        ,{true,true,true,true,true}
        ,{false,true,true,true,false}
        ,{false,true,false,true,false}};
    boolean[][] star = new boolean[size][size];

    public void Start()
    {
        DrawStar(0, 0, 0,0,0);
        PrintStar(star);
    }

    private void DrawStar(int level, int row, int col, int x, int y)
    {
        if(level <n)
        {
            if(bluePrint[row][col])
            {
                DrawStar((level+1), 0, 0,x+row*(Power5(n-1-level)),y+col*(Power5(n-1-level)));
            }
            if(col<4) DrawStar(level, row, (col+1),x,y);
            else if(row<4) DrawStar(level,(row+1),0,x,y);
        }
        else
        {
            if(bluePrint[row][col]) star[x][y] = true;
            if(col<4) DrawStar(level, row, (col+1),x,y);
            else if(row<4) DrawStar(level,(row+1),0,x,y);
        }
    }

    private void PrintStar( boolean[][] n)
    {

        StringBuilder sb = new StringBuilder();

        for (boolean[] i : n) {
            for (boolean j : i) {
                sb.append( j ? '*' : ' ' );
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }

    private short Power5(int n) {
        short a = 1;
        for (int i = 0; i < n; i++) {
            a *= 5;
        }
        return a;
    }
}

