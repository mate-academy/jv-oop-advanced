package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }

    public Figure getRandomFigure() {
        int number = new Random().nextInt(5);
        ColorSupplier supplier = new ColorSupplier();
        int choice = new Random().nextInt(5);

        switch (choice) {
            case 0:
                return new Circle(number, supplier.getRandomColor());
            case 1:
                return new Rectangle(number, number, supplier.getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(number, number, number, supplier.getRandomColor());
            case 3:
                return new RightTriangle(number, number, supplier.getRandomColor());
            case 4:
                return new Square(number, supplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getNotRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        int choice = new Random().nextInt(5);
        switch (choice) {
            case 0:
                return new Circle(3, supplier.getRandomColor());
            case 1:
                return new Rectangle(4, 2, supplier.getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(4, 3, 2, supplier.getRandomColor());
            case 3:
                return new RightTriangle(2, 5, supplier.getRandomColor());
            case 4:
                return new Square(4, supplier.getRandomColor());
            default:
                return getDefaultFigure();

        }
    }
}
