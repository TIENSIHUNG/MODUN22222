import java.util.ArrayList;
import java.util.Arrays;

public class gop {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = {4,5,6};
        ArrayList arrayList = new ArrayList<>();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            arrayList.add(arr2[i]);
        }
        System.out.println(arrayList);
    }

}
