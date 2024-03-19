import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        
        List<Integer> rank = new ArrayList<>();
        int[] answer = new int[score.length];
        int index =0;
        
        // score 순회
        for(int n : score){
            rank.add(n);
            rank.sort(Comparator.reverseOrder());
            // size > k
            if(rank.size()>k){
                // sort 후 마지막 요소 제거
                rank.remove(rank.size()-1);
            }
            // 맨 뒤 점수 저장
            answer[index++] = rank.get(rank.size()-1);
        }
        return answer;
    }
}