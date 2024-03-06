class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        //배열 순회
        for(int i =0; i< queries.length; i++){
            // 쿼리 값 꺼내서 인덱스로 활용하여 arr에 값 더하기
            for(int j = queries[i][0]; j<= queries[i][1]; j++){
                arr[j]++;
            }
        }
        
        return arr;
    }
}