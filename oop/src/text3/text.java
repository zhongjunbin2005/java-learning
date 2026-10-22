package text3;

import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        String Username ="zhangsan";
        String Password ="123456";
        Scanner sc=new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String username =sc.next();
            System.out.println("请输入密码：");
            String password =sc.next();
            if(Username.equals(username) && Password.equals(password)){
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("用户名或密码错误，请重新输入，还有"+(3-i)+"次机会");
            }
        }
    }
}
