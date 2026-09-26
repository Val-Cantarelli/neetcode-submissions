class Solution {
    public int longestConsecutive(int[] nums) {
     
        // cria e pooula set
        // acha candidatos
        //busca progressiva
        Set<Integer> set = new HashSet<>();
        for (int elem:nums) set.add(elem);

        int max =0;

        for (int elem:set){
            if(!set.contains(elem-1)){
                int maxSoFar = 0;
                for (int x = 0; x < set.size(); x++){
                    if(set.contains(elem +x)){
                        maxSoFar++;
                    }else break;

                }if(maxSoFar>max) max = maxSoFar;
            }
        }
        return max;
    }
}
