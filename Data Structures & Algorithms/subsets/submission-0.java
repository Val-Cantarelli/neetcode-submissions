class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        backtrackingSets(nums,0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrackingSets(int[]nums, int index, List<Integer> current, List<List<Integer>> result) {

        if(index == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        backtrackingSets(nums,index+1, current, result);

        current.removeLast();

        backtrackingSets(nums,index +1, current,result);
    }
}
