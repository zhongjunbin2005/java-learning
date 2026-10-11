public class Hello {
    record Point(int x, int y) {}

    public static void main(String[] args) {
        var p = new Point(3, 4);
        System.out.println("Hello, Java " + System.getProperty("java.version"));
        System.out.println("Point = " + p);
    }
}
