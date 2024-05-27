import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        //  크기가 0이면 길이*5
        if(cacheSize == 0) return cities.length*5;
    
        int answer = 0;
        // 제거 순위 리스트
        ArrayList<String> list = new ArrayList<>();
        
        // 저장 셋
        Set<String> set = new HashSet<>();
        
        // 배열 순회
        for(String s : cities){
            // 소문자 변환
            String city = s.toLowerCase();   
        
            if(set.contains(city)){   
            // 셋에 있으면
                // answer +1
                answer ++;
                
                // 리스트에서 제거 후 맨뒤에 삽입
                list.remove(city);
                list.add(city);
            }
            else{
            // 셋에 없으면 
                // answer +5
                answer +=5;
                set.add(city);
                
                if(list.size() != cacheSize){
                // 공간여유가 있으면 리스트에 삽입
                    list.add(city);
                }
                else{
                // 공간여유가 없으면 리스트 맨앞에 요소 삭제 후 삽입
                    String rv = list.get(0);
                    list.remove(rv);
                    set.remove(rv);
                    list.add(city);
                }
            }
        }
        
        return answer;
    }
}

