import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WineTasting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cups = new int[n];
        for(int i = 0; i < n; i++) {
            cups[i] = Integer.parseInt(br.readLine());
        }
        int[] dp = new int[n];
        dp[0] = cups[0];
        if(n > 1) {
            dp[1] = cups[0] + cups[1];
        }
        if(n > 2) {
            dp[2] = Math.max(cups[0] + cups[2], cups[1] + cups[2]);
            dp[2] = Math.max(dp[1], dp[2]);
        }
        if(n > 3) {
            for(int i = 3; i < n; i++) {
                dp[i] = Math.max(dp[i-2], dp[i-3] + cups[i-1]) + cups[i];
                dp[i] = Math.max(dp[i-1], dp[i]);
            }
        }
        System.out.println(dp[n-1]);
    }
}
