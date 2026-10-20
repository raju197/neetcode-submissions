class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int []{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int []{-1,-1};

        //2 pointer only works with sorted array
        // Arrays.sort(nums);
        // int left = 0;
        // int right = nums.length -1;
        // while(left<right){
        //     int sum = nums[left]+nums[right];
        //     if(sum == target){
        //         return new int[] {left,right};
        //     }else{
        //          if(sum < target){
        //         left++;
        //     }else{
        //         right--;
        //     }
        //     }
           
        // }
        // return new int[] {-1,-1};

        
    }
}
