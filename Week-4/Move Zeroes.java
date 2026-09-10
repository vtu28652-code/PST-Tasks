class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;


        for ( int i =0;i < nums.length; i++){
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] =nums[insertPos] ;
                nums[insertPos] = temp;
                
                insertPos++;
            }
        }
    }
}
#Input
nums =
[0,1,0,3,12]
#Output
[1,3,12,0,0]
