import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 90 && num <= 100) {
            System.out.println("A");
        } else if (num >= 80 && num <=89) {
            System.out.println("B");
        } else if (num >= 70 && num <= 79) {
            System.out.println("C");
        } else if (num >= 60 && num <= 69) {
            System.out.println("D");
        } else if (num >=50 && num <= 59) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}
