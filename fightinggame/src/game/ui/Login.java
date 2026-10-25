package game.ui;

import game.APP;
import game.domain.User;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Login {
    public void start() {
        ArrayList<User> list = new ArrayList<>();
        while (true){
            System.out.println("欢迎来到文字格斗游戏");
            System.out.println("请选择您的操作：1.登录 2.注册 3.退出");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
        switch (choose) {
            case "1" -> login(list);
            case "2" -> register(list);
            case "3" -> {
                System.out.println("用户选择了退出操作");
                System.exit(0);
            }
        }
    }
    }
//登录操作

    public void login(ArrayList<User> list) {
        System.out.println("用户选择了登录操作");
        System.out.println("请输入账号：");
        Scanner sc=new Scanner(System.in);
        String username=sc.next();
        if(!contains(list,username)){
                System.out.println("用户名"+username+"不存在请先注册");
                return;
        }
        int index=findindex(list,username);
        User u=list.get(index);
        if(!u.isState()){
            System.out.println("当前账号已被禁用，请联系管理员");
            return;
        }
            for (int i = 0; i < 3; i++) {
                while(true) {
                    String rightCode = getCode();
                    System.out.println("验证码：" + rightCode);
                    System.out.println("请输入验证码：");
                    String code = sc.next();
                    if (!code.equalsIgnoreCase(rightCode)) {
                        System.out.println("错误请重新输入!");
                        continue;
                    }
                    break;
                }
                System.out.println("请输入密码：");
                String password=sc.next();
                if(password.equals(u.getPassword())){
                    System.out.println("登录成功，游戏启动");
                    Fightinggame fg=new Fightinggame();
                    fg.gameStart(username);
                    break;
                } else if (i==2) {
                    u.setState(false);
                    System.out.println("账号"+u.getUsername()+"已被锁定");
                } else{
                    System.out.println("密码错误，你还有" + (2-i) + "次机会");
                }
            }
    }
//注册操作

    public void register(ArrayList<User> list) {
        System.out.println("用户选择了注册操作");
        User u = new User();
        Scanner sr = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名：");
            String username = sr.next();
            if (!checkLen(3, 16, username)) {
                System.out.println("格式错误请重新输入");
                continue;
            }
            if (!checkUsername(username)) {
                System.out.println("格式错误请重新输入");
                continue;
            }
            if (contains(list, username)) {
                System.out.println("用户名重复请重新输入!");
                continue;
            }
            u.setUsername(username);
            break;
        }

        while (true) {
            System.out.println("请输入密码：");
            String password = sr.next();
            if (!checkLen(3, 8, password)) {
                System.out.println("密码长度只能在3~8之间");
                continue;
            }
            if (!checkPassword(password)) {
                System.out.println("密码格式错误请重新输入");
                continue;
            }
            System.out.println("请再次输入密码");
            String password2 = sr.next();
            if (!password.equals(password2)) {
                System.out.println("两次输入密码不一致请重新输入");
                continue;
            }
            u.setPassword(password);
            break;
        }

        list.add(u);
        System.out.println("用户"+u.getUsername()+"注册成功");

    }

//寻找用户是否存在，在就返回下标
    public int findindex(ArrayList<User> list,String username){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

//寻找用户名是否存在
    public boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }


    public boolean checkUsername(String username) {
        int a[] = getCount(username);
        return a[0] >= 1 && a[2] == 0;
    }

    public boolean checkPassword(String password) {
        int b[] = getCount(password);
        return b[0] > 0 && b[2] == 0;
    }


    public boolean checkLen(int minnum, int maxnum, String str) {
        return str.length() >= minnum && str.length() <= maxnum;
    }

    public int[] getCount(String useInfo) {
        int charCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (int i = 0; i < useInfo.length(); i++) {
            char c = useInfo.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                charCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            } else {
                otherCount++;
            }
        }
        int[] arr = new int[]{charCount, numberCount, otherCount};
        return arr;
    }

    public static String getCode(){
        ArrayList<Character> list=new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a' +i));
            list.add((char)('A' +i));
        }
        StringBuilder sb=new StringBuilder();
        Random r=new Random();
        for (int i = 0; i < 4; i++) {
            int index=r.nextInt(list.size());
            char c= list.get(index);
            sb.append(c);
        }
        sb.append(r.nextInt(10));
        char[] c=sb.toString().toCharArray();
        int i=r.nextInt(c.length);
        char m=0;
        m=c[c.length-1];
        c[c.length-1]=c[i];
        c[i]=m;
        return new String(c);
    }





}