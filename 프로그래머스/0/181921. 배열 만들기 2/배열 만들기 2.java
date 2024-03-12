
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int l, int r) {
                int[] answer = IntStream.iterate(l, i -> i + 1).limit(r - l + 1).filter(i -> (i+"").replaceAll("[05]","").isEmpty()).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        return answer;

    }
}