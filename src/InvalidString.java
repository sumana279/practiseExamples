import java.util.*;

/**
 * Created by svishnu on 8/21/16.
 */
public class InvalidString {
    private List<String> ret = new ArrayList<>();

    public List<String> removeInvalidParentheses(String s) {
        if (s == null) {
            return new ArrayList<String>();
        }
        Set<String> visited = new HashSet<>();
        visited.add(s);
        bfs(Arrays.asList(s), visited);
        return ret;
    }

    private boolean valid(String str) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                left++;
            } else if (str.charAt(i) == ')') {
                right++;
            }
            if (right > left) {
                return false;
            }
        }
        return left == right;
    }

    private void bfs(List<String> list, Set<String> visited) {
        boolean found = false;
        List<String> next = new ArrayList<>();
        for (String str : list) {
            if (valid(str)) {
                found = true;
                ret.add(str);
            } else {
                for (int i = 0; i < str.length(); i++) {
                    String newStr = str.substring(0, i) + str.substring(i + 1);
                    if (!visited.contains(newStr)) {
                        next.add(newStr);
                        visited.add(newStr);
                    }
                }
            }
        }
        if (found) {
            return;
        }
        bfs(next, visited);
    }
}