class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i< phone_number.length()-4; i++){
            sb.append("*");
        }
        for(int i=3; i>=0; i--){
            sb.append(phone_number.charAt(phone_number.length()-1-i));
        }
        
        return sb.toString();
    }
}