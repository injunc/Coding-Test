import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        String[] result = {"", "", "", ""};

        String r = dartResult.replace("10", "@");
        
        result[0] += r.charAt(0);
        
        char[]crr  =  r.toCharArray();
        int index = 0;
        
        for(int i=1; i< crr.length; i++){
            char c = crr[i];
            if((c >= '0' && c<= '9')  ||  c=='@'){
                String str = c+"";
                result[++index] += str;
                continue;
            }
            result[index] += c;
        }

        int[] sum = new int[3];
        
        String type = "SDT";
        
        for(int i =0; i<=2; i++){
            String[] cr = result[i].split("");
            int n = 0;
            
            if(cr[0].equals("@")){
                n = 10;
            }else{
                n = Integer.parseInt(cr[0]);
            }
            int tp = type.indexOf(cr[1])+1;
            
            sum[i] = (int)Math.pow(n, tp);
            
            if(cr.length == 3){
                boolean opt = cr[2].equals("*")?true:false;
                
                if(opt){
                    sum[i] = sum[i]*2;
                    if(i != 0){
                        sum[i-1] = sum[i-1]*2;
                    }
                }else{
                    sum[i] = -sum[i];
                }
            }
        }
        return Arrays.stream(sum).sum();
    }
}