class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        // int[] count = new int[3];
        // for(int num: nums){
        //     count[num]++;
        // }

        // int index = 0;
        // for(int i = 0; i < 3; i++){
        //     while(count[i]-- > 0){
        //         nums[index++] = i;
        //     }
        // }

        int low = 0, mid = 0, high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}