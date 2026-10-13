package day1;

public class whiletext1 {
    public static void main(String[] args) {
        double paper=0.1;
        double height=8848860;
        int count=0;
        while(paper<height){
            paper*=2;
            count+=1;
        }
        System.out.println(count);
    }
}
