class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueElem = new HashSet<>();

        for(int num:nums)
        {
            if(uniqueElem.isEmpty()){uniqueElem.add(num);}
            else{
                if(uniqueElem.contains(num))return true;
                
            }uniqueElem.add(num);

        }
        
        return false;
        
    }
}