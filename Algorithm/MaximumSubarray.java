class Solution {
    public int maxSubArray(int[] nums) {
        int arraySum[] = new int[nums.length];
        arraySum[0] = nums[0];
        int result = arraySum[0];
        
        // nums[i] , arraySum[i-1] + nums[i] 비교
      
        // arraySum은 전체 배열의 subArray들의 합 중 최댓값을 갖는 것이 아니라 현재인 i번째까지를 포함한 subArray들 중 최댓값을 가진다.(i번째가 끝인 subArray)
        // arraySum[i-1] + nums[i]가 더 작다는 것은 둘 다 음수거나 arraySum[i-1]은 음수, nums[i]는 양수라는 뜻이다. -> 결국 arraySum이 음수이면 i번째부터 subArray 시작.
        // 만약 이 값들을 가지고도 최댓값이 나올수 있지 않냐? -> 불가능. 이런 생각은 subArray 중간에 음수가 포함되었을 수 있지 않나. 이지만
        // 이럴 경우 arraySum + 음수 값이 양수여야 가능. 음수가 되면 현재의 값을 + 해주는 것이 아니라 현재의 값을 - 시키기 때문에 더 가져갈 필요가 없음.
        // 0~5번째 합이 10인데 0~2번째 합이 -3이면 3~5번째 합은 13이라는 뜻. subArray 합이 마이너스가 되면 새로시작하는게 더 이득이다.
       
        // i번째에서 i번째까지의 subArray의 합 중 최댓값을 넣어야한다.
        // 여기서 선택은 이전까지의 subArray를 쭉 이어갈지, 아니면 i번째부터 새로운 subArray를 이어갈지이다.
        // subArray는 연속적이여야 하므로 그냥 arraySum[i-1]을 i번째에 넣어버리면 arraySum[i] + nums[i+1]은 사실은 i번째가 빠져있으므로 연속되지 않아 subArray가 성립이 안된다.
        for (int i=1;i<nums.length;i++) {
            if ((arraySum[i-1] + nums[i]) == Math.max(nums[i], arraySum[i-1] + nums[i])) {
                arraySum[i] = arraySum[i-1] + nums[i];
            }
            else if (nums[i] == Math.max(nums[i], arraySum[i-1] + nums[i])) {
                arraySum[i] = nums[i];
            }
            
            result = Math.max(arraySum[i], result);
        }
        
        return result;
    }
}
