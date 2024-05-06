import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int len = elements.length;
         
        for(int e : elements) set.add(e);
        
        // elements 길이만큼 반복
        for(int i =1; i<len; i++){
            // 슬라이딩 윈도우 시작 0 ~ 마지막
            int head = 0;
            int tail = head+i;
            
            int sum =0;
            for(int s=0; s<=tail; s++){
                sum+= elements[s];
            }
            
            // head 값  끝까지 이동
            while(head < len){   
                // 앞에 값 제거, 뒤에 값 추가
                sum -= elements[head++];
                tail = (++tail)%len;
                sum += elements[tail];
                
                // set에 저장
                set.add(sum);
            }
        }
        return set.size();
    }
}

    
