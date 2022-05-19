package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_INTEGER = 10;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = "WHITE";
    private final Random random;

    public FigureSupplier(Random random) {
        this.random = random;
    }

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier(random);
        String randomColor = colorSupplier.getRandomColor();
        String whatFigure = Shape.values()[random.nextInt(Shape.values().length)].toString();
        switch (whatFigure) {
            case "CIRCLE":
                int randC = random.nextInt(RANDOM_INTEGER);
                Circle circle = new Circle(randC);
                circle.setColor(randomColor);
                return circle;
            case "ISOSCELES_TRAPEZOID":
                int randT = random.nextInt(RANDOM_INTEGER);
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(randT, randT, randT);
                isoscelesTrapezoid.setColor(randomColor);
                return isoscelesTrapezoid;
            case "RECTANGLE":
                int randR = random.nextInt(RANDOM_INTEGER);
                Rectangle rectangle = new Rectangle(randR, randR);
                rectangle.setColor(randomColor);
                return rectangle;
            case "RIGHT_TRIANGLE":
                int randTr = random.nextInt(RANDOM_INTEGER);
                RightTriangle rightTriangle = new RightTriangle(randTr, randTr);
                rightTriangle.setColor(randomColor);
                return rightTriangle;
            default:
                int randS = random.nextInt(RANDOM_INTEGER);
                Square square = new Square(randS);
                square.setColor(randomColor);
                return square;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_CIRCLE_RADIUS);
        circle.setColor(DEFAULT_CIRCLE_COLOR);
        return circle;
    }
}
