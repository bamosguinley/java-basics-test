import java.util.Scanner; 
import java.util.ArrayList;
public class ScannerT {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> userName = new ArrayList<>();

        System.out.println("Entrez un nombre : ");
        String test = scanner.nextLine();
        userName.add(test);
        System.out.println("Le test est"+test);
        System.out.println("Le test est"+userName.size());
    }

}