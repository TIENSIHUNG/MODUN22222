import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("nhap so muon chen");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("nhap index");
        int z = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= arr.length; i++) {
            if (i == z){
                arr[i] = x;
                for (int j = arr.length; j > i ; j--) {
                    arr[j] = arr[j-1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
