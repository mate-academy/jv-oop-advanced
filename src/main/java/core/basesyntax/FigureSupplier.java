package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int MAX_SIDE = 10;
    private static final int INDEX = 4;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = random.nextInt(INDEX);
        switch (index) {
            case 1:
                Square square = new Square(random.nextInt(MAX_SIDE),
                        colorSupplier.getRandomColor());
                return square;
            case 2:
                Rectangle rectangle = new Rectangle(random.nextInt(MAX_SIDE),
                        random.nextInt(MAX_SIDE),
                        colorSupplier.getRandomColor());
                return rectangle;
            case 3:
                Circle circle = new Circle(random.nextInt(MAX_SIDE),
                        colorSupplier.getRandomColor());
                return circle;
            case 4:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(MAX_SIDE),
                        random.nextInt(MAX_SIDE), random.nextInt(MAX_SIDE),
                        colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            default:
                RightTriangle rightTriangle = new RightTriangle(random.nextInt(MAX_SIDE),
                        random.nextInt(MAX_SIDE),
                        colorSupplier.getRandomColor());
                return rightTriangle;
        }
    }

    public Figure getDefaultFigure() {
        Circle circleDefault = new Circle(10, "WHITE");
        return circleDefault;
    }
}
