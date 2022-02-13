import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long f1 = 0;
        long f2 = 1;
        long f3 = 0;
        if(n == 1)
            System.out.println(1);
        else {
            for(int i = 2; i <= n; i++) {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
            System.out.println(f3);
        }
    }
}