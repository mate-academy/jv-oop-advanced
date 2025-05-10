package core.basesyntax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of figures: ");
        int number = scanner.nextInt();
        Figure[] figures = new Figure[number];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0;i < number;i++) {
            figures[i] = (i < number / 2)
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
