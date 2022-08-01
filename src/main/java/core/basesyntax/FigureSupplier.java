package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_PROPERTY_VALUE = 100;
    private static final int NUMBER_OF_FIGURES = 5;

    public Figure getRandomFigure() {
        String color = new ColorSupplier().getRandomColor();
        Random random = new Random();
        double side = random.nextInt(MAX_PROPERTY_VALUE);
        double side2 = random.nextInt(MAX_PROPERTY_VALUE);
        double side3 = random.nextInt(MAX_PROPERTY_VALUE);
        int whichFigure = random.nextInt(NUMBER_OF_FIGURES);
        switch (whichFigure) {
            case 1:
                return new IsoscelesTrapezoid(color,side,side2,side3);
            case 2:
                return new RightTriangle(color,side,side2);
            case 3:
                return new Rectangle(color,side,side2);
            case 4:
                return new Square(color,side);
            default:
                return new Circle(color, side);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE",10);
    }
}
