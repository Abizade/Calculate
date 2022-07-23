import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Calculate cl = new Calculate();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ilk ededi daxil edin! ");
        double firsNumber = scanner.nextDouble();
        System.out.println("Ikinci ededi daxil edin!");
        double secontNumber = scanner.nextDouble();

        var c = cl.calculate(firsNumber, secontNumber);
        System.out.println("Cemi: " + df.format(c));
    }
}