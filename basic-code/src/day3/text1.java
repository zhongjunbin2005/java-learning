package day3;

public class text1 {

     public static void main(String[] args) {
         int val=2;
         int [] nums={2,2,1,1,3,4,5,6};
         int fast=0;
         int slow=0;
         while(fast<nums.length){
             if(nums[fast]!=val){
                 nums[slow]=nums[fast];
                 slow++;
             }
             fast++;
         }
         for(int i=0;i<=slow;i++){
             System.out.print(nums[i]+" ");
         }

    }
}
