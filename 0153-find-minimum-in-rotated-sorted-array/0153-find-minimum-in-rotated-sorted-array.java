class Solution {
    public int findMin(int[] nums) {
        
        int low=0;
        int high=nums.length-1;
        int min1;
        
        while(low<=high){

            int mid= low + (high-low)/2;
        //array already sorted
            if(nums[low]<=nums[high]){
                return nums[low];
            }
        // left array sorted
            if(nums[low]<=nums[mid]){
               low=mid+1;
            }
        //minimun lies on the 
            else{
               high=mid;
            }
        }
        return nums[low];
    }
}