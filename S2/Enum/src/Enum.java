import java.util.Scanner;

public class Enum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = 2;
        while (count<=20){
            for (int i = 1; i < n; i++) {
                if (n%i==0){
                    n++;
                }else {
                    System.out.println(n+" ");
                    count++;
                    break;
                }
            }

        }
    }
}
