class Solution {
    public boolean canJump(int[] nums) {
        int cost = 1;
        int j = nums.length - 2;
        int pos = nums.length -1;
        while(j>=0){
            if(nums[j]>=cost){
                pos = j;
                cost = 1;
            }
            else{
                cost++;
            }
            j--;
        }
        if(pos == 0) return true;
        else return false;
    }
}