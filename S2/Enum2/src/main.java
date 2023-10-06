import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = 2;
        while (count<=100){
            for (int i = 1; i < n; i++) {
                if (n%i==0){
                    n++;
                }else {
                    System.out.println(n+" ");
                    count++;
                    break;
                }if (n>100){
                    return;
                }
            }

        }
    }
}
