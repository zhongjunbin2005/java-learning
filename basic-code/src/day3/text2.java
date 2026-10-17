package day3;

import java.util.Random;
import java.util.Scanner;

public class text2 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("请输入金额：");
        int money=sr.nextInt();
        System.out.println("请输入红包个数：");
        int n=sr.nextInt();
        if(money<n){
            System.out.println("金额不足请充值");
        }else {
            for(int i=1;i<=(n-1);i++){
                Random r=new Random();
                int mymMoney=r.nextInt(money-(n-i))+1;
                money=money-mymMoney;
                System.out.println("第"+i+"个人抢到"+mymMoney+"分钱");
            }
            System.out.println("第"+n+"个人抢到"+money+"分钱");
        }
    }
}
