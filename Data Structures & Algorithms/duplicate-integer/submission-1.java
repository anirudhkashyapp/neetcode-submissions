class Solution {
    public static boolean hasDuplicate(int[] nums) {
       Arrays.sort(nums);
       for(int i=0; i<nums.length-1; i++){
        if(nums[i]==nums[i+1]){
            return true;
        }
       }
       return false; 
    }
    public static void main(String args[]){
        int[] nums = {3,1,4,5,5};
        System.out.println(hasDuplicate(nums));
    }
}