class Solution {
    public int singleNumber(int[] nums) {
      ArrayList<Integer> twiceNumber = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (twiceNumber.contains(nums[i])) {
                twiceNumber.remove(twiceNumber.indexOf(nums[i]));
                }
            else {
                twiceNumber.add(nums[i]);
                }
            }
        return twiceNumber.get(0);
    }
}
