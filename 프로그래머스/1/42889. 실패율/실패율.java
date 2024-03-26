import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {    
        // 실패율 배열 만들기
        
        int[] play = new int[N+2];
        int[] fail = new int[N+2];
        
        for(int s : stages){
            for(int i = s; i>=0; i--){
                play[i]++;
            }
            if(s==N+1) continue;
            fail[s]++;
        }
        
        Stage[] answer = new Stage[N];
        for(int i =1; i<=N; i++){
            
            double up = fail[i]*1.0;
            double down = play[i]*1.0;
            double res = up/down;
            
            if(up == 0.0){
                answer[i-1] = new Stage(i, 0.0);
            }else{
                answer[i-1] = new Stage(i, res);
            }
            
        }
        
        Arrays.sort(answer);
      
        int[] a = new int[answer.length];
        
        for(int i =1; i<=N; i++){
            Stage s= answer[i-1];
             a[i-1] = s.n;
        }
        
        
        
        return a;
    }
    
    static class Stage implements Comparable<Stage>{
        public int n;
        public double rate;
        
        public Stage(int n, double r){
            this.n =n;
            rate =r;
        }
        
        @Override
        public int compareTo(Stage s){
            if(s.rate > this.rate){
                return 1;
            }else if(s.rate == this.rate){
                return 0;
            }else{
                return -1;
            }
        }
    }
        
        
}
    