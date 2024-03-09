class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1) return arr;
        
        // 거듭제곱 값 배열 생성
        int[] trr = new int[10];
        
        trr[0] = 2;
        for(int i =1; i<10; i++){
            trr[i] = trr[i-1]*2;
        }
        
        int size = 0;
        // 배열 순회
        for(int n : trr){
            // 값보다 작거나 같을경우 종료
            if(arr.length <= n) {
                size = n;
                break;
            }
        }
        
        // 해당 값만큼 배열 생성
        int[] answer = new int[size];
        // 앞에서 부터 배열 채우기
        for(int i=0; i< arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}
/// 6   00110

// 2    00010
// 4    00100
// 8    01000
// 16   10000