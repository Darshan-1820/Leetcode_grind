class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] copy = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            copy[i] = nums[i];
        }
        Arrays.sort(copy);
        for(int i = 0; i<copy.length; i++){
            if(!mp.containsKey(copy[i])) mp.put(copy[i], i);
        }
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(mp.containsKey(nums[i])) ans[i] = mp.get(nums[i]);
        }

        return ans;
    }
}