import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
            
        for(int i=0; i<a.length(); i++){
            if( a.charAt(i) < 'a'){
                answer += a.substring(i,i+1).toLowerCase();
            }else{
                answer += a.substring(i,i+1).toUpperCase();
            }
        }
        
        System.out.println(answer);
    }
}