import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jakiej metody chcesz uzyc?");
        System.out.println("1 add,2 substraction,3 multiplication,4 division?");
        int wybranaMetoda = scanner.nextInt();
        if (wybranaMetoda == 1) {
            System.out.println("Wpisz pierwsza liczbe");
            int x = scanner.nextInt();
            System.out.println("Wpisz druga liczbe");
            int y = scanner.nextInt();
            System.out.println("Suma" + kalkulator.add(x, y));
        }
    }
}















