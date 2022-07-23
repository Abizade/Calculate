import java.util.Scanner;

public class Calculate {
    public int chooseMenu() {
        int menu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu secin!");
        System.out.println("1 - Toplama");
        System.out.println("2 - Cixma");
        System.out.println("3 - Vurma");
        System.out.println("4 - Bolme");

        System.out.println("Senin secdiyin emeliyyat : ");
        menu = scanner.nextInt();
        return menu;
    }

    public double calculate(double a, double b) {
        int userSelect;
        userSelect = chooseMenu();
        do {
            switch (userSelect) {
                case 1:
                    return a + b;
                case 2:
                    return a - b;
                case 3:
                    return a * b;
                case 4:
                    return a / b;
                default:
                    return 0;
            }
        } while (userSelect > 5);
    }
}
