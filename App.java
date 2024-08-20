import java.util.Scanner; 

public class App {
    public static void main(String[] args){
        //exercice 1
        byte aByte=1;
        short aShort;
        int anInt;
        long aLong;
        float aFloat;
        double aDouble;
        char aChar;
        boolean aBoolean;
        // System.out.println("Taille de int : " + Integer.BYTES + " octets");
        // System.out.println("Taille de long : " + Long.BYTES + " octets");
        // System.out.println("Taille de byte : " + Byte.BYTES + " octets");
        // System.out.println("Taille de float : " + Float.BYTES + " octets");
        // System.out.println("Taille de char : " + Character.BYTES + " octets");
        // System.out.println("Taille de double : " + Double.BYTES + " octets");
        // System.out.println("Taille de short : " + Short.BYTES + " octets");

        //exercice 2
        String str1="Hello ";
        String str2="world";
        String str3=str1+str2;
        // System.out.println(str3);
        // System.out.println(str1 == str2);
        // System.out.println(str1.equals(str2));

        //exercice 3
        int a=2;
        int b=a*2;
        int c=b*2;
        // System.out.println(a>b && b<a);

        //exercice 4
        int intVar =2;
        double doubleVar=intVar;
        short shortVar = (short) doubleVar;
        // System.out.println(intVar);
        // System.out.println(doubleVar);
        // System.out.println(shortVar);

        //exercice 5
        int x=2;
        float y=2;
        y= (int) y;
        // System.out.println(x>y);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scanner.next();
}
}