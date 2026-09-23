class Solution {
    public int longestConsecutive(int[] nums) {
        // create the set
        Set<Integer> set = new HashSet<>();
        for (int num:nums) set.add(num);

        // var longest
        int longest = 0;

        //find a candidate to the search
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i] -1)){
                int candidate = nums[i];
                int longestSoFar = 0;
                // start the progressive search
                for (int j = 0; j < nums.length ; j++) {
                    if(set.contains(candidate+j)) longestSoFar++;
                    else break;
                }
                // update the longest
                if(longest < longestSoFar) longest = longestSoFar;
            }
        }
        return longest;
    }
}
