public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {
        if (A.length <= 1) {
            return A.length;
        }
        
        // Figure out smallest and largest values in the array
        int maxValue = A[0]; 
        int minValue = A[0];
        for (int i=0; i<A.length; i++) {
            if (A[i] > maxValue) 
                maxValue = A[i];
            else if (A[i] < minValue )
                minValue = A[i];
        }
        
        // Figure out the offset and length of the temp array
        int offset = (minValue <= 0) ? -(minValue): 0; 
        int length = offset + 1;
        if (maxValue >= 0)
        	length += maxValue;
        	
        // Fill out temp array with values from the input array
        boolean[] temp = new boolean[length];
        for (int i=0; i< A.length; i++) {
        	int index = A[i] + offset;
            temp[index] = true;
        }
        
        // Find the longest consecutive
        int longest = 0;
        int currentlongest = 0;
        for (int i=0; i< temp.length; i++) {
            if (temp[i]) {
                currentlongest++;
                if (currentlongest > longest) {
                    longest = currentlongest;
                }
            } else {
                currentlongest = 0;
            }
        }
        return longest;
    }
}

