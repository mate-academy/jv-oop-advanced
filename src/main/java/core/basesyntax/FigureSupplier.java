package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_INT = 11;
    public static final int DEFAULT_INT = 10;
    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figures figure = Figures.values()[rand.nextInt(Figures.values().length)];

        switch (figure) {
            case TRIANGLE:
                String triangleColor = colorSupplier.getRandomColor();
                int firstLeg = rand.nextInt(MAX_INT);
                int secondLeg = rand.nextInt(MAX_INT);
                return new RightTriangle(
                    triangleColor,
                    firstLeg,
                    secondLeg);
            case TRAPEZOID:
                String trapezoidColor = colorSupplier.getRandomColor();
                int base1 = rand.nextInt(MAX_INT);
                int base2 = rand.nextInt(MAX_INT);
                int height = rand.nextInt(MAX_INT);
                return new IsoscelesTrapezoid(
                    trapezoidColor,
                    base1,
                    base2,
                    height);
            case CIRCLE:
                String circleColor = colorSupplier.getRandomColor();
                int radius = rand.nextInt(MAX_INT);
                return new Circle(
                    circleColor,
                    radius);
            case SQUARE:
                String squareColor = colorSupplier.getRandomColor();
                int side = rand.nextInt(MAX_INT);
                return new Square(
                    squareColor,
                    side);
            case RECTANGLE:
            default:
                String rectangleColor = colorSupplier.getRandomColor();
                int length = rand.nextInt(MAX_INT);
                int width = rand.nextInt(MAX_INT);
                return new Rectangle(
                    rectangleColor,
                    length,
                    width);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name().toLowerCase(), DEFAULT_INT);
    }
}
