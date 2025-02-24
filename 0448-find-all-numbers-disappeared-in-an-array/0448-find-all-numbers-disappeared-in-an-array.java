class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x: nums){
            if(!set.contains(x)) set.add(x);
        }

        List<Integer> myList = new ArrayList<>();
        for(int i = 1; i<=nums.length; i++){
            if(!set.contains(i)) myList.add(i);
        }

        return myList;


    }
}