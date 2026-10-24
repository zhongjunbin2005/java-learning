package Stringtest;

public class ArrayUtil {
    public static String arraytostring(int []arr){
        StringBuilder sb=new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
                sb.append("]");
            }
            else{
                sb.append(arr[i]);
                sb.append(" ,");
            }
        }
        return sb.toString();
    }
}
