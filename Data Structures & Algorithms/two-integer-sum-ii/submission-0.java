class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 2 pointers: if sum > target: anda j
        // else anda i

        int i = 0;
        int j = numbers.length-1;
        int[] result = new int[2];
        while(i < j){
            int sum =numbers[i]+numbers[j];
            if(sum < target) i++;
            else if (sum > target) {j--;
            }
            else {
                result[0] = i+1;
                result[1] = j+1;
                break;
            }
        }
        return result;
    }
}
