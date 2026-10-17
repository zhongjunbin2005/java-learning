package text2;

public class Dog {
    private String name;
    private int age;
    public Dog(){

    }
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age>0&&age<15){
            this.age=age;
        }else {
            System.out.println("年龄"+age+"不在合理范围之内");
        }
    }
    public int getAge(){
        return age;
    }
    public void eat(){
        System.out.println(age+"岁的"+name+"在吃骨头");
    }
}
