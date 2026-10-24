package game.domain;

import java.util.Random;

public class User {
    private String id;
    private String username;
    private String password;
    private boolean state;

    public User(){
        id=createID();
        state=true;

    }
    public User(String username,String password){
        id=createID();
        this.username=username;
        this.password=password;
        state=true;
    }

    public String createID(){
        StringBuilder sb=new StringBuilder("player");
        Random r=new Random();
        for (int i = 0; i < 5; i++) {
            int num=r.nextInt(10);
            sb.append(num);
        }
        return sb.toString();
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }





}


