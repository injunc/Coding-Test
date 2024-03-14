class Solution {
    public int solution(String s) {
        String answer = "";

       int index =0;
        while (index < s.length()) {
            System.out.println(index);
            char caseVar = s.charAt(index);

            switch (caseVar) {
            case 'z':
                index += 4;
                answer += "0";
                break;
            case 'o':
                index += 3;
                answer += "1";
                break;
            case 'e':
                index += 5;
                answer += "8";
                break;
            case 'n':
                index += 4;
                answer += "9";
                break;
            case 't':
                if (s.charAt(index + 1) == 'w') {
                    index += 3;
                    answer += "2";
                } else {
                    index += 5;
                    answer += "3";
                }
                break;
            case 'f':
                if (s.charAt(index + 1) == 'o') {
                    index += 4;
                    answer += "4";
                } else {
                    index += 4;
                    answer += "5";
                }
                break;
            case 's':
                if (s.charAt(index + 1) == 'i') {
                    index += 3;
                    answer += "6";
                } else {
                    index += 5;
                    answer += "7";
                }
                break;
            default:
                answer+=s.substring(index,index+1);
                index+=1;
                break;
            }
        }
        return Integer.parseInt(answer);
    }
}