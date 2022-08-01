package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int figureSelector = random.nextInt(FigureSelector.values().length);
        switch (figureSelector) {
            case 1:
                Circle circle = new Circle(random.nextInt(MAX_SIZE),
                        colorSupplier.getRandomColor());
                return circle;
            case 2:
                Square square = new Square(random.nextInt(MAX_SIZE),
                        colorSupplier.getRandomColor());
                return square;
            case 3:
                Rectangle rectangle = new Rectangle(random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE), colorSupplier.getRandomColor());
                return rectangle;
            case 4:
                RightTriangle rightTriangle = new RightTriangle(random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE), colorSupplier.getRandomColor());
                return rightTriangle;
            case 5:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(random
                        .nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE),
                        colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }
}
