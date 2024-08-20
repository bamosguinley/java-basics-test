import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ListArray {
    public static void sortArray(int[] table) {
        Arrays.sort(table);
        for (int n : table) {
            System.out.println(n);
        }
    }
    public static void filtreTable(int[] arg) {
        for (int i : arg) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        // nameList.add("null");
        ArrayList<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(9);
        number.add(4);
        number.add(7);
        int[] table = { 8, 6, 2, 85, 3, 8, 36, 85, 6, 3 };
        sortArray(table);
        filtreTable(table);
    }
}
