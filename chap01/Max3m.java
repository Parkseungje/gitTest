package chap01;

public class Max3m {

    static int max4(int a, int b, int c, int d){
        int max = a;

        if(b>max)
            max = b;

        if(c>max)
            max = c;

        if(d>max)
            max = d;

        return max;
    }

    public static void main(String[] args) {

        System.out.println(max4(3,34,9,10));

    }
}
