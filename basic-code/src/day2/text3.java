package day2;

public class text3 {
    public static void main(String[] args) {
        int  [] nums={1,3,5,6};
        int target=7;
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                System.out.println(i);
                found=true;
                break;
            }
        }
            if(!found){
                boolean result=false;
                for(int j=0;j< nums.length;j++){
                    if(target<nums[j]){
                        System.out.println("应该插入在下标为"+j+"之前");
                        result=true;
                        break;
                    }
                }
                if(!result){
                    System.out.println("应该插入在下标为"+nums.length+"之后");
                }

            }


    }
}
