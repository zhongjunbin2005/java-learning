package Stringtest;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {


     String a="123456789";
     char arr []=a.toCharArray();
     Random r=new Random();
     for (int i=0;i<arr.length;i++){
         int index=r.nextInt(arr.length);
         char tem;
         tem=arr[index];
         arr[index]=arr[i];
         arr[i]=tem;
     }
        String result= new String(arr);
        System.out.println(result);

    }
}
