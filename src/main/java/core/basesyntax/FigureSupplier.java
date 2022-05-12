package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    ColorSupplier colorSupplier = new ColorSupplier();


    public Figure getRandomFigure() {
        int index = new Random().nextInt(Figures.values().length);
        String color = colorSupplier.getRandomColor();
        double sideA = new Random().nextInt(100);
        double sideB = new Random().nextInt(100);
        double sideC = new Random().nextInt(100);
        switch (Figures.values()[index]) {
            case SQUARE:
                return new Square(sideA, color);
            case RECTANGLE:
                return new Rectangle(sideA, sideB, color);
            case RIGHT_TRIANGLE:
                return new RightTriangle(sideA, sideB, color);
            case CIRCLE:
                int radius = new Random().nextInt(100);
                return new Circle(sideA, color);
            default:
                return new IsoscelesTrapezoid(sideA, sideB, sideC, color);

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }
}
