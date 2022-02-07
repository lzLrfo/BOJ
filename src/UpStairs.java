import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpStairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stairs = new int[n];
        for(int i = 0; i < n; i++)
            stairs[i] = Integer.parseInt(br.readLine());
        int[] dp = new int[n];
        dp[0] = stairs[n-1];
        
    }
}
