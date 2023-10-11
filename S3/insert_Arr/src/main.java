import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        System.out.println("nhap so muon chen");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("nhap index");
        int z = Integer.parseInt(sc.nextLine());
        ArrayList arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        arrayList.add(z,x);
        System.out.println(arrayList);
    }
}
