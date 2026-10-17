package text2;

public class text {
    public static void main(String[] args) {
        Dog a=new Dog();
        a.setAge(5);
        a.setName("小白");
        System.out.println(a.getAge());
        System.out.println(a.getName());
        a.eat();
        a.setAge(a.getAge()+1);
        System.out.println("一年后小狗的年龄："+a.getAge());
        a.eat();
        Dog b=new Dog("小黑",6);
        b.eat();
    }
}
