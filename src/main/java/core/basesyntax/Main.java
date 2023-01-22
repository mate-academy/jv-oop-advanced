package core.basesyntax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FigureSupplier firstFigure = new FigureSupplier();

        Scanner in = new Scanner(System.in);
        System.out.println("choose number from 1 to 6: ");
        int number = in.nextInt();
        switch (number) {
            case 1:
                firstFigure.getRandomRectangle().draw();
            case 2:
                firstFigure.getRandomRightTriangle().draw();
            case 3:
                firstFigure.getRandomCircle().draw();
            case 4:
                firstFigure.getRandomSquare().draw();
            case 5:
                firstFigure.getRandomIsoscelesTrapezoid().draw();
            case 6:
                firstFigure.getDefaultFigure().draw();

        }
    }
}
