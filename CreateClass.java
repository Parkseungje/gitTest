
public class CreateClass {

    public static void printLength(String s) {
        if (s == null) {
            throw new NullPointerException("Input string cannot be null");
        }
        System.out.println("Length of input string is " + s.length());
    }

    public static void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age: " + age);
        }
    }

    public static void main(String[] args) {
        //printLength(null);
        setAge(130);
    }
}