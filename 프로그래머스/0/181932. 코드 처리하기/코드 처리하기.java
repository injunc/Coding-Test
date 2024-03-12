class Solution {
    public String solution(String code) {
        String answer = "";
        
        boolean mode = false;
        
        // code 순회
        for(int i=0; i< code.length(); i++){
            // 1이 나오면 mode 반전
            if(code.charAt(i) == '1') mode = !mode;
            else{
                if(i%2==0 && !mode){
                // 짝수일때 mode가 0이면 추가 
                    answer+= code.charAt(i);
                }else if(i%2!=0 && mode){
                // 홀수일때 mode가 1이면 추가  
                    answer+= code.charAt(i);
                }
            }
        }
        return answer.length()>1?answer:"EMPTY";
    }
}