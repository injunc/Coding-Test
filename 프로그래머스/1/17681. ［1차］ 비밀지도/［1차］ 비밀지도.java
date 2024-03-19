class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        System.out.println(Integer.MAX_VALUE);

        // 배열 순회
        for(int i =0; i< n; i++){    
            // arr1 arr2 | 연산
            int code = arr1[i] | arr2[i];
            
            // n길이 만큼 비트 문자열로 변환
            long bs = Long.parseLong(Integer.toBinaryString(code));
            String reg = "%0"+n+"d";
            String map = String.format(reg, bs);
            
            // 1은 # 변환
            map = map.replaceAll("1", "#");
            // 0은 공백 변환
            map = map.replaceAll("0", " ");
            
            // answer에 추가
            answer[i] = map;
        }
        
        return answer;
    }
}