public class Boucles {

    public static void pair() {
        for (int j = 1; j <= 20; j++) {
            if (j % 2 != 0) {
                continue;
            }
            System.out.println(j);
        }
    }

    public static void sum() {
        int sum = 0;
        byte i = 1;
        while (i <= 10) {
            sum += 1;
            i++;
        }
        sum += sum;
        System.out.println(sum);
    }

    public static void reverser(Integer num) {
        String numString = num.toString();
        int taille = numString.length();
        do {
            System.out.print(numString.charAt(taille - 1));
            taille--;
        } while (taille > 0);
    }

    public static void maximum() {
        int[] tab = { 1, 2, 7, 78, 5 };
        int curentMax = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (curentMax < tab[i]) {
                curentMax = tab[i];
            }
        }
        System.out.println(curentMax);
    }

    public static void countInt(Integer num) {
        // String numString = num.toString();
        // int count = 0;
        // int taille = numString.length();
        // int verifTaille = numString.length();

        // while (numString.charAt(taille - 1) % 2 == 0) {
        // System.out.println(numString.charAt(taille - 1));
        // count ++;
        // }
        // System.out.println(count);
    }

    public static void main(String[] args) {

        maximum();
        // reverser(123445);
        countInt(158555);

    }

}
