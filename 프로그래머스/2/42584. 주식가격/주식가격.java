import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i<prices.length;i++)
            answer[i] = prices.length-i-1;
        
        for(int i=0;i<prices.length;i++) {
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                answer[stack.peek()] = i-stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return answer;
    }
}