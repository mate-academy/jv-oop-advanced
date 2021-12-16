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
                System.out.println("IsoscelesTrapezoid"); ///до чого тут вивід в консоль?
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
        return getRandomFigure();  //цей метод завжди null повертає, а потрібно щоб повертав об'єкти фігур
    }

    public Figure getDefaultFigure() {
        return new Circle(10);
    }
}


