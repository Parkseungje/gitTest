package chap02;

public class IntArray {

    public static void main(String[] args) {
        int[] a = new int[5];

        int answer = 2;

        System.out.println(hello(answer));

    }


    public static String hello(int answer){
        answer = 2;
        return "hello"+answer;
    }
}
