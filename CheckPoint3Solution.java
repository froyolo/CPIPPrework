public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
        if (A.length <= 0 || B > A.length)
            return 0;
        
        int[] Aclone = A.clone();
        Arrays.sort(Aclone);
        return Aclone[B-1];

    }
}
