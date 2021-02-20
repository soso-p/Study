class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = target;
        int result[] = new int[2];
        for (int i=0;i<nums.length-1;i++) {
            sum = 0;
            sum += nums[i];
            
            // i번째 + j번째 합이 target과 같은 지 비교
            for (int j=i+1;j<nums.length;j++) {
                if (sum+nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
