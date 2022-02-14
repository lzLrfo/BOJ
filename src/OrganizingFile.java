import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class OrganizingFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> files = new HashMap<>();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String extension = st.nextToken();
            if(!files.containsKey(extension)) {
                files.put(extension, 1);
            }
            else {
                files.put(extension, files.get(extension) + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        Object[] extensions = files.keySet().toArray();
        Arrays.sort(extensions);
        for(Object file : extensions) {
            sb.append(file).append(" ").append(files.get(file)).append("\n");
        }
        System.out.println(sb);
    }
}
