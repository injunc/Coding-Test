class Solution {
    public String solution(int a, int b) {
        int[] year = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30};
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};     
        
        int today =0;
        
        // +7 그대로
        for(int i =0; i< a-1; i++){
            today += year[i];
        }
        today += b-1;
        
        today %=7;
        
        
        return day[today];
        // a-1 추가
        // b 추가
    }
}