import java.util.*;

class Solution {
    public int solution(String s) {
        if(s.length() ==1) return 0;
        
        int answer = 0;
        Queue<Character> queue = new LinkedList<>();
        for(char c : s.toCharArray()) queue.add(c);
        
        // 길이 만큼 반복
        for(int i =0; i< s.length(); i++){  
            // 스택 검사 
            Stack<Character> stack = new Stack();
            boolean check = true;
            
            for(char ch : queue){  
                if(stack.size() ==0){
                    if(ch==')' || ch=='}' || ch==']'){
                        check = false;
                        break;
                    }else{
                        stack.add(ch);
                    }
                }else{
                    if(ch == '}'){
                        if(stack.peek()=='{'){
                            stack.pop();
                        }else{
                            stack.add(ch);
                        }
                    }
                    else if(ch == ')'){
                        if(stack.peek()=='('){
                            stack.pop();
                        }else{
                            stack.add(ch);
                        }
                    } 
                    else if(ch == ']'){
                        if(stack.peek()=='['){
                            stack.pop();
                        }else{
                            stack.add(ch);
                        }
                    } 
                    else{ stack.add(ch);}
                }   
            }
            
            // 카운트
            if(check && stack.size()==0) {
                answer++;
            } 
            
            // 1칸씩 밀기
            char peak = queue.poll();
            queue.add(peak);
        }  
        return answer;
    }
}