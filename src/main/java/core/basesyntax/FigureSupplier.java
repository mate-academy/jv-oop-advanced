package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureSelector = new Random().nextInt(FigureSelector.values().length);
        switch (figureSelector) {
            case 1:
                Circle circle = new Circle(new Random().nextInt(MAX_SIZE),
                        colorSupplier.getRandomColor());
                return circle;
            case 2:
                Square square = new Square(new Random().nextInt(MAX_SIZE),
                        colorSupplier.getRandomColor());
                return square;
            case 3:
                Rectangle rectangle = new Rectangle(new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE), colorSupplier.getRandomColor());
                return rectangle;
            case 4:
                RightTriangle rightTriangle = new RightTriangle(new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE), colorSupplier.getRandomColor());
                return rightTriangle;
            case 5:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(new Random()
                        .nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE), new Random().nextInt(MAX_SIZE),
                        colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, "WHITE");
    }
}
