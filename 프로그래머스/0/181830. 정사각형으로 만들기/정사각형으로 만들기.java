import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {

        // 정사각형 한 변의 길이 결정
        int a1 = arr.length;
        int a2 = arr[0].length;
        int size = Math.max(a1, a2);
        
        // 배열 구성 
        int[][] answer = new int[size][size];
        
        // arr 순회
        for(int i=0; i<a1; i++){
            for(int j=0; j<a2; j++){
                // 요소 배열에 넣기
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}