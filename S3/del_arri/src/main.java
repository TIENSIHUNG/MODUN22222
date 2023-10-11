import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8,10};
        Scanner sc  = new Scanner(System.in);
        for (int i :
                arr) {
            System.out.print(i);
        }
        System.out.println("nhap so muon xoa");
        int x = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                int c = i;
                for (int j = c; j < arr.length-1 ; j++) {
                    arr[j] = arr[j+1];
                }
            }

        }
        for (int i :
                arr) {
            System.out.print(i);
        }
    }

}
