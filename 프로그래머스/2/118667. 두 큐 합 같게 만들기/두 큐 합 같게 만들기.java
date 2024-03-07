import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;   
        // queue 만들기 각 큐 합 구하기
        Queue<Integer> q1 =new LinkedList<>();
        Queue<Integer> q2 =new LinkedList<>();
        long s1 = 0;
        long s2 = 0;
        
        for(int i=0; i<queue1.length; i++){
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            s1 += (long)queue1[i];
            s2 += (long)queue2[i];
        }
        
        int num=0;
        // 두 큐의 각 합이 같아질 때까지 반복
        while(s1 != s2){
            // 큰 큐에서 요소 제거
            // 작은 큐에 추가
            if(s1 > s2){
                num = q1.poll();
                q2.add(num);
                s1 -= (long)num;
                s2 += (long)num;
            }else{
                num = q2.poll();
                q1.add(num);
                s2 -= (long)num;
                s1 += (long)num;
            }
            // 횟수 카운트
            answer++;
            //  횟수가 큐 길이*4면 종료
            if(answer>queue1.length*4) break;
        }
        
        if(s1 != s2) return -1;
        // 합이 같지 못하면 -1 반환 
        return answer;
    }
}
