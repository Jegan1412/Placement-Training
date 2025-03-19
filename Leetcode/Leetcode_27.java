class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length, res = n, max = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i] == val){
                res--;
                nums[i] = max;
            }
        }
        Arrays.sort(nums);
        return res;
    }
}