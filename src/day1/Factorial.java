package day1;

public class Factorial {
    public static void main(String[] args) {
        long f = fac(5);
        System.out.println(f);
    }
    public static long fac(int n){
        if (n < 0){
            return -1;
        }
        else if(n == 0 || n == 1){
            return 1;
        }
        return n * fac(n-1);
    }
}
