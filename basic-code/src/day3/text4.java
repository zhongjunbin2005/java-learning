package day3;

import java.util.Random;

public class text4
{
    public static void main(String[] args) {
        int []a=new int [6];
        Random r =new Random();
        for(int i=0;i<1000;i++) {
            a[r.nextInt(6)]++;
        }
        for(int i=0;i<6;i++){
            System.out.print("结果为"+i+":"+a[i]+"票");
            System.out.println();
        }
        int max=0;
        int result=0;
        for(int j=1;j<6;j++){
            if(a[j]>max){
                max=a[j];
                result=j;
            }
        }
        System.out.println("获得票数最多的是"+result+"，票数为"+max);
    }
}
