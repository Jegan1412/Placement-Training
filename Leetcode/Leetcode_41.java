class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, i=0;
        if(n==1) return (nums[n-1]==1)?2:1;
        while(nums[i]<=0){
            if((i+1)>=n) return 1;
            i++;
        }
        if(nums[i]>1) return 1;
        for(i=i+1;i<n;i++){
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] != (nums[i-1]+1)) return nums[i-1]+1;
        }
        return nums[i-1]+1;
    }
}