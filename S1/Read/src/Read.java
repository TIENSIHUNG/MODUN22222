import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so muon doc");
        int x = Integer.parseInt(sc.nextLine());
        if (x>0 && x<=10){
            int z = (x%100)%10;
            switch (z){
                case 0 :
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3: System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;

            }
        } else if (x<=20) {

        }
    }
}
