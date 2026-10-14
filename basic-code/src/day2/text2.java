package day2;

public class text2 {
    public static void main(String[] args) {
       int [] numbers=new int[10];
       int [] nums1={1,3,5,7,9};
       int [] nums2={2,4,6,8,10};
       int a= 0;
       int b= 1;
       for(int i =0;i< nums1.length;i++){
           if(nums1[i]<nums2[i]){
               numbers[a]=nums1[i];
               numbers[b]=nums2[i];
           }else{
               numbers[a]=nums2[i];
               numbers[b]=nums1[i];
           }
           a+=2;
           b+=2;
        }
       for(int i =0;i<numbers.length;i++){
           System.out.print(numbers[i]+" ");
       }
    }
}
