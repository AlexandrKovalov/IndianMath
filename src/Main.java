import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static int x;
    private static int maxNumber;
    private static int minNumber;
    private static int change;

    private static ArrayList<Integer> arrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        x = scanner.nextInt();
        intToArrList(x, arrayList);
        sort(arrayList);
        minNumber = ArrListToInt(arrayList); // get minNumber

        reverse(arrayList);
        maxNumber = ArrListToInt(arrayList);//get MaxNumber

        change = maxNumber - minNumber;
        System.out.println(maxNumber);
        System.out.println(minNumber);
        System.out.println(change);
    }
    public static void intToArrList(int x, ArrayList<Integer> arrayList1) {
        String str = Integer.toString(x);
        for (int i = 0; i < str.length(); i++) {
            arrayList1.add(Character.getNumericValue(str.charAt(i)));
        }
    }
    public static void sort (ArrayList<Integer> arrayList1) {
        Collections.sort(arrayList1);
    }
    public static void reverse (ArrayList<Integer> arrayList1) {
        Collections.reverse(arrayList1);
    }
    public static int ArrListToInt (ArrayList<Integer> arrayList1) {
        String str = "";
        int result;
        for (Integer a: arrayList1) {
            str = str + a.toString();
        }
        result = Integer.parseInt(str);
        return result;
    }


}
