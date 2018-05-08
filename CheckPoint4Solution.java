public class Solution {
    public int[] nextGreater(int[] A) {
        int[] output = new int[A.length];
        for (int i =0; i< A.length; i++) {
            output[i] = -1;
        }
        
        if (A.length <= 1)
            return output;
         
        for (int i=0; i< A.length; i++) {
            for (int j=i+1; j< A.length; j++) {
                if (A[j] > A[i]) {
                    output[i] = A[j];
                    break;
                }
            }
        }
        return output;
    }
}

