import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        // nameList.add("null");
        ArrayList<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(9);
        number.add(4);
        number.add(7);
        int[] table = { 8, 6, 2, 85, 3, 8, 36, 85, 6, 3 };
        Arrays.sort(table);
        for (int n :table ) {
            System.out.println(n);
        }
    }
}
