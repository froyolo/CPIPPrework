public class Solution {
    public int[][] prettyPrint(int A) {
        int numcols = 2*A - 1;
        int[][] pattern = new int[numcols][numcols];
        
        int number = A;
        int offset = 0;
        while (number > 0) {
            for (int i=offset; i<numcols-offset; i++) {
                for (int j=offset; j<numcols-offset; j++) {
                    pattern[i][j]=number;
                }
            }
            number--;
            offset++;
        }
        return pattern;
    }
}
