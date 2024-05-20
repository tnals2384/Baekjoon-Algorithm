import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        int i = 0; int j = 0; int max = 0;
        
        while(j < A.length) {
            if(A[i] < B[j]) {
                answer++;
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        return answer;
    }
}