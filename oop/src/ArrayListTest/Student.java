package ArrayListTest;

public class Student {
    private String name;
    private String id;
    private int age;
    public Student(){

    }
    public Student(String name,String id,int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
