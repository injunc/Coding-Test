import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        List<Integer> list = new ArrayList<>(Arrays.asList(a,b,c,d));
        int answer = 1;
        
        //map 사용해서 갯수 저장
        Map<Integer,Integer>map = new HashMap<>();
        
        for(int q : list){
            map.put(q, map.getOrDefault(q,0)+1);
        }
        
        // 길이 검사해서 
        int size = map.size();
        
        // 1 이면
        if(size == 1) return a*1111;    
        
        // 1:1:1:1 이면
        if(size == 4) return list.stream().mapToInt(i->i).min().getAsInt();
        
        // 2:1:1 이면
        if(size == 3){
            
            int key = 0;
            for(int k : map.keySet()){
                if(map.get(k) == 2) key = k;
            }
            final int no = key;
            int[] sum = map.keySet().stream().filter(n->n!=no).mapToInt(p->p).toArray();
            
            for(int h : sum) answer*=h;
            return answer;
        }
        
        // 2:2 이면
        if(map.get(a) == 2){
            int[] sum = list.stream().distinct().mapToInt(i->i).toArray();
            return (sum[0]+sum[1])*Math.abs(sum[0]-sum[1]);
            
        }else{
            //3:1 이면
            int[] sum = list.stream().distinct().mapToInt(i->i).toArray();
            int mul = map.get(sum[0])==3?sum[0]:sum[1];
            int sol = mul==sum[0]?sum[1]:sum[0];
            
            return (10*mul+sol)*(10*mul+sol);
        }
    }
}