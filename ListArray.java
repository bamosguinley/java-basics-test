import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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
    
    public static void maximumMin(int[] t) {
        int curentMax = t[0];
        int currentMin = t[0];
        for (int i = 0; i < t.length; i++) {
            if (curentMax < t[i]) {
                curentMax = t[i];
            }
            if (currentMin < t[i]) {
                currentMin = currentMin;
            } else {
                currentMin = t[i];
            }
        }
        System.out.println(curentMax);
        System.out.println(currentMin);
    }

    public static void findIndex(int[] t, int number) {
        System.out.println(Arrays.binarySearch(t, number));
    }

    public static void delDoublon(int [] t) {
        HashSet<Integer> sansDouble = new HashSet<Integer>();
        for (Integer tel : t) {
            sansDouble.add(tel);
        }
        for (Integer tel : sansDouble) {
            System.out.println(tel);
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

        int[] table = { 8, 6, 2,2,2,2,2,2, 85, 3, 8, 36, 85, 6, 3 };
        // sortArray(table);
        // filtreTable(table);
        // maximumMin(table);
        // findIndex(table,2);
        delDoublon(table);
    }
}
