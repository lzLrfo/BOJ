import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Ecology {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> trees = new HashMap<>();
        int total = 0;
        String tree;
        while(true) {
            tree = br.readLine();
            if(tree == null || tree.length() == 0)
                break;
            total++;
            if(trees.containsKey(tree))
                trees.put(tree, trees.get(tree) + 1);
            else
                trees.put(tree, 1);
        }
        Object[] species = trees.keySet().toArray();
        Arrays.sort(species);
        StringBuilder sb = new StringBuilder();
        for(Object s : species) {
            double per = (double) trees.get(s) / total * 100;
            sb.append(s).append(" ").append(String.format("%.4f", per)).append("\n");
        }
        System.out.println(sb);
    }
}
