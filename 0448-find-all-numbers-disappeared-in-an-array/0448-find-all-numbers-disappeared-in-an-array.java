class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // 2nd Approach:
        List<Integer> myList = new ArrayList<>();
        int index = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < 0 ) index = Math.abs(nums[i])-1;
            else index = nums[i]-1;

            if(nums[index]>0){
                nums[index] = nums[index] * -1;
            }

        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0) myList.add(i+1);
        }

        return myList;

    }
}