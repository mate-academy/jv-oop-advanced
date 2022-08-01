package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 6;
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = random.nextInt(Figures.values().length);

        switch (Figures.values()[index]) {
            case RECTANGLE: {
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setFirstSide(random.nextInt(MAX_NUMBER));
                rectangle.setSecondSide(random.nextInt(MAX_NUMBER));
                return rectangle;
            }
            case SQUARE: {
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(random.nextInt(MAX_NUMBER));
                return square;
            }
            case ISOSCELES_TRAPEZOID: {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setTopSide(random.nextInt(MAX_NUMBER));
                isoscelesTrapezoid.setDownSide(random.nextInt(MAX_NUMBER));
                isoscelesTrapezoid.setSide(random.nextInt(MAX_NUMBER));
                return isoscelesTrapezoid;
            }
            case RIGHT_TRIANGLE: {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstSide(random.nextInt(MAX_NUMBER));
                rightTriangle.setSecondSide(random.nextInt(MAX_NUMBER));
                return rightTriangle;
            }
            case CIRCLE:
            default: {
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(MAX_NUMBER));
                return circle;
            }
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(Color.WHITE.name().toLowerCase());
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }
}
