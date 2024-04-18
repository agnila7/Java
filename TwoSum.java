class TwoSum {
    public int[] twoSumFind(int[] nums, int target) {
        int k = nums.length;
        for(int i= 0 ; i <= nums.length - 1; i++ ){
            for(int j = i; j <= nums.length; j++ ){
                if(j != i && nums[i] + nums [j] == target){
                    return new int[] {i,j};
                 }
            }
            
        }
        return new int[] {};
    }
}