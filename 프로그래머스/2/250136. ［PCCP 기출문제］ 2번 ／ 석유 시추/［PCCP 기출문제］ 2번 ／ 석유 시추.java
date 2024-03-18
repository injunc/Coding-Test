import java.util.*;

class Solution {
    static boolean[][] visted;
    static int[][] move = {{-1,0}, {1,0}, {0,1}, {0,-1}};
    static int[] oils;
    
    public int solution(int[][] land) {
        visted = new boolean[land.length][land[0].length];
        oils = new int[land[0].length];
        
        for(int i =0; i< land[0].length; i++){          
            for(int j=0; j< land.length; j++){
                if(land[j][i] == 1  && !visted[j][i]){
                    BFS(j, i, land);
                }
            }
        }
        return Arrays.stream(oils).max().getAsInt();
    }
    
    public void BFS(int ox, int oy, int[][] land){
        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        
        // 방문 배열 업데이트, 카운트
        visted[ox][oy] = true;
        int count =1;
        
        queue.add(new int[]{ox,oy});
        
        while(!queue.isEmpty()){
            int[] cod = queue.poll();
            int x = cod[0];
            int y = cod[1];
            
            set.add(y);
           
            // 현재 위치에 가능한 동서남북 이동(호출)  
            for(int[] m : move){
                int lx = x + m[0];
                int ly = y + m[1];
            
                if(lx >= 0 && lx < land.length && ly >= 0 && ly < land[0].length){
                    if(!visted[lx][ly] && land[lx][ly] == 1){
                        queue.add(new int[]{lx, ly});
                        visted[lx][ly] = true;
                        count++;
                    }
                }
            }
        }
        
        for(int index :set){
            oils[index] += count;
        }
        return;
    }
}