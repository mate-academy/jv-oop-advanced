package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int FIGURE_UNITS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                Circle circle = new Circle();
                circle.setCircle(random.nextInt(FIGURE_UNITS), colorSupplier.getRandomColor());
                return circle;
            case 1:
                Square square = new Square();
                square.setSquare(random.nextInt(FIGURE_UNITS), colorSupplier.getRandomColor());
                return square;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setRectangle(random.nextInt(FIGURE_UNITS),
                                       random.nextInt(FIGURE_UNITS),
                                       colorSupplier.getRandomColor());
                return rectangle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setRightTriangle(random.nextInt(FIGURE_UNITS),
                                               random.nextInt(FIGURE_UNITS),
                                               colorSupplier.getRandomColor());
                return rightTriangle;
            default:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setIsoscelesTrapezoid(random.nextInt(FIGURE_UNITS),
                                                         random.nextInt(FIGURE_UNITS),
                                                         random.nextInt(FIGURE_UNITS),
                                                         colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setCircle(5, Color.WHITE.name());
        return circle;
    }
}
