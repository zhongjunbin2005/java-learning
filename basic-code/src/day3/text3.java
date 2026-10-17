package day3;

public class text3
{
    public static void main(String[] args) {
        int [] arr1={1,3,5,7,9};
        int [] arr2={2,4};
        double result=number(arr1,arr2);
        System.out.println(result);
    }
    public static double number (int [] arr1,int [] arr2){
        int [] arr=new int[arr1.length+arr2.length];
        int index1=0;
        int index2=0;
        for(int i=0;i<arr.length;i++){
            if (index1==arr1.length){
                arr[i]=arr2[index2];
                index2++;
                continue;
            }
            if (index2==arr2.length){
                arr[i]=arr1[index1];
                index1++;
                continue;
            }
            if (arr1[index1]<arr2[index2]){
                arr[i]=arr1[index1];
                index1++;
            }else {
                arr[i]=arr2[index2];
                index2++;
            }
        }
        if(arr.length%2==0){
            double a=(arr[arr.length/2-1]+arr[arr.length/2])/2.0;
            return a;
        }else {
            double a=arr[arr.length/2];
            return a;
        }

    }
}
