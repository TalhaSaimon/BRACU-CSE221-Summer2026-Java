import java.io.*;
import java.util.*;
public class Problem_F_The_King_of_Königsberg{
    public static void main(String [] args)throws Exception{
          BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
          PrintWriter pw= new PrintWriter(System.out);
          StringTokenizer st =new StringTokenizer(br.readLine());
          int n=Integer.parseInt(st.nextToken());
          st =new StringTokenizer(br.readLine());
          int i=Integer.parseInt(st.nextToken());
          int j=Integer.parseInt(st.nextToken());
          int count=0;

          int[] row = {-1, -1, -1, 0, 0, 1, 1, 1};
          int[] col = {-1,  0,  1,-1, 1,-1, 0, 1};
          ArrayList<Integer> arr=new ArrayList<>();
           for (int idx = 0; idx < 8; idx++) {
            int new_row = i + row[idx];
            int new_col = j + col[idx];
            if (new_row >= 1 && new_row <= n && new_col >= 1 && new_col <= n) {
                arr.add(new_row);
                arr.add(new_col);
                count++;
            }
        }

        pw.println(count);
        for(int p=0;p<arr.size();p+=2){
            pw.println(arr.get(p)+" "+arr.get(p+1));
        }
        pw.flush();

    }
}