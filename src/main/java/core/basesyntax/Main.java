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
                break;
            case 2:
                firstFigure.getRandomRightTriangle().draw();
                break;
            case 3:
                firstFigure.getRandomCircle().draw();
                break;
            case 4:
                firstFigure.getRandomSquare().draw();
                break;
            case 5:
                firstFigure.getRandomIsoscelesTrapezoid().draw();
                break;
            case 6:
                firstFigure.getDefaultFigure().draw();
                break;
            default:
                System.out.println("this number doesn't exist");
        }
    }
}
