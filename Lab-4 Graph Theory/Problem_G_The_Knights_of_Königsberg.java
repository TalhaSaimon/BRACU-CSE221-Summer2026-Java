import java.io.*;
import java.util.*;
public class Problem_G_The_Knights_of_Königsberg {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] row = {-2, -2, -1, -1,  1,  1,  2,  2};
        int[] col = {-1,  1, -2,  2, -2,  2, -1,  1};

        boolean[][] board = new boolean[n + 1][m + 1];

        int[][] knights = new int[k][2];
        for (int i = 0; i < k; i++) {
             st = new StringTokenizer(br.readLine());
            knights[i][0] = Integer.parseInt(st.nextToken());
            knights[i][1] = Integer.parseInt(st.nextToken());
            board[knights[i][0]][knights[i][1]] = true;
        }

        boolean found = false;
        for (int i = 0; i < k && !found; i++) {
            for (int idx = 0; idx < 8; idx++) {
                int new_row = knights[i][0] + row[idx];
                int new_col = knights[i][1] + col[idx];
                if (new_row >= 1 && new_row <= n && new_col >= 1 && new_col <= m && board[new_row][new_col]) {
                    found = true;
                    break;
                }
            }
        }
        if(found){
          pw.println("YES"); 
        }
        else{
          pw.println("NO");
        }
        pw.flush();
    }
}
