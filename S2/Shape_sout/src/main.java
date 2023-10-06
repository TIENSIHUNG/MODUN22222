import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("""
                    1. hinh chu nhat
                    2. tam giac vuong
                    3. tam giac vuong nguoc
                    4. exit
                    """);
            int x = Integer.parseInt(sc.nextLine());

            switch (x){
                case 1:
                    for (int i = 1; i <= 3 ; i++) {
                        for (int j = 1; j <= 5 ; j++) {
                            System.out.print(" *");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 5 ; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }break;
                case 3:
                    for (int i = 5; i >=0 ; i--) {
                        for (int j = i; j >=0; j--) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }break;
                case 4:System.exit(0);
            }

        }
    }
}
