class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            int l = arr1[i] | arr2[i];
            long sum = (long)l;
            String s = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(sum)));            
            
            s =s.replaceAll("1", "#");
            s =s.replaceAll("0", " ");
            
            answer[i] = s;
        }
        
        return answer;
    }
}