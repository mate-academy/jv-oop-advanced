package model;

import java.util.Random;

public class FigureSupplier {

    private final FigureSupplier figureSupplier = new FigureSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureSupplier = random.nextInt(5);
        switch (figureSupplier) {
            case 0:
                System.out.println("Circle");
                break;
            case 1:
                System.out.println("IsoscelesTrapezoid");
                break;
            case 2:
                System.out.println("Rectangle");
                break;
            case 3:
                System.out.println("RightTriangle");
                break;
            case 4:
                System.out.println("Square");
                break;
            default:
                break;
        }
        return getRandomFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(10);
    }
}


