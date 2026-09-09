import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();


        double diferencaX = x2 - x1;
        double diferencaY = y2 - y1;
        double distancia = Math.sqrt(Math.pow(diferencaX, 2) + Math.pow(diferencaY, 2));

        System.out.printf("%.4f\n", distancia);

        scanner.close();
    }
}