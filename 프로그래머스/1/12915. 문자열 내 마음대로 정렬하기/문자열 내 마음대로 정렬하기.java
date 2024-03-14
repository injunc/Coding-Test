import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        final int f = n;

         Arrays.sort(strings, (o1, o2) ->  (o2.charAt(f) - o1.charAt(f))==0?
                     o1.compareTo(o2): o1.charAt(f) - o2.charAt(f)
        );
        return strings;
    }
}