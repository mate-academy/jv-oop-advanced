package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int CIRCLE_DEFAULT_RADIUS = 10;
    public static final int MAX_FIGURE_COUNT = 5;
    public static final int MAX_LENGTH = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(MAX_FIGURE_COUNT);
        if (randomFigureIndex == 0) {
            Circle circle = new Circle(random.nextInt(MAX_LENGTH), colorSupplier.getRandomColor());
            return circle;
        } else if (randomFigureIndex == 1) {
            Square square = new Square(random.nextInt(MAX_LENGTH), colorSupplier.getRandomColor());
            return square;
        } else if (randomFigureIndex == 2) {
            RightTriangle rightTriangle = new RightTriangle(random.nextInt(MAX_LENGTH),
                                                            random.nextInt(MAX_LENGTH),
                                                            colorSupplier.getRandomColor());
            return rightTriangle;
        } else if (randomFigureIndex == 3) {
            Rectangle rectangle = new Rectangle(random.nextInt(MAX_LENGTH),
                    random.nextInt(MAX_LENGTH),
                    colorSupplier.getRandomColor());
            return rectangle;
        }
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(MAX_LENGTH),
                    random.nextInt(MAX_LENGTH),
                    random.nextInt(MAX_LENGTH),
                    colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(CIRCLE_DEFAULT_RADIUS, Color.WHITE.toString());
        return circle;
    }
}
