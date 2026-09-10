class Solution {
    public int[] twoSum(int[] nums, int target) {
        // crio um map key:elem, value: index
        // complement = target - nums[i]
        // se complement está no mapa return new int[]{i,map.getKey(complement)}
        // se nao está, só adiciona o elem

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement))return new int[]{map.get(complement),i};
            map.put(nums[i],i);
            
            

        }
        return new int[]{-1,-1};
        
    }
}
