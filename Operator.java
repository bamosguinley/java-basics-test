public class Operator {
    static int fact = 0;
    public static int sum(int a, int b) {
        return a + b;
    }
    public static boolean isEven(int number) {
        return (number%2==0)? true:false;
    }

    public static int factorirel(int a) {
        
        for (int i = 0; i <= a; i++) {
            fact *= i;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 5));
    }
}
