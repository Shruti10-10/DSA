class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;
        int secondmax=-1;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secondmax=max;
                max=nums[i];
                index=i;
            }
            else if(nums[i]>secondmax){
                secondmax=nums[i];
            }
        }
        if(max>=2*secondmax){
            return index;
        }
        return -1;
    }
}