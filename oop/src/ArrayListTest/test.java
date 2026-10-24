package ArrayListTest;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<Student>();
        Student a1=new Student("zhangsan","001",18);
        Student a2=new Student("lisi","002",19);
        Student a3=new Student("wangwu","003",20);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        for (int i = 0; i < list.size(); i++) {
            Student stu1=list.get(i);
            System.out.println(stu1.getName()+", "+stu1.getAge()+", "+stu1.getId());
        }
        int result=idfindstudent("005",list);
        System.out.println(result);

    }
    public static int idfindstudent(String id,ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            if(stu.getId().equals(id)){
                return i;
            }
        }
        return -1;

    }
}
