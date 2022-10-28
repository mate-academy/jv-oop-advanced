package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureEnumeration.values().length);
        FigureEnumeration randomFigureName = FigureEnumeration.values()[index];
        String randomColor = colorSupplier.getRandomColor();
        switch (randomFigureName) {
            case ISOSCELES_TRAPEZOID:
                int topSide = random.nextInt();
                int bottomSide = random.nextInt();
                int trapezoidHeight = random.nextInt();
                return new IsoscelesTrapezoid(randomColor,
                        topSide, bottomSide, trapezoidHeight);
            case RECTANGLE:
                int firstSide = random.nextInt();
                int secondSide = random.nextInt();
                return new Rectangle(randomColor, firstSide, secondSide);
            case SQUARE:
                int side = random.nextInt();
                return new Square(randomColor, side);
            case RIGHT_TRIANGLE:
                int firstLeg = random.nextInt();
                int secondLeg = random.nextInt();
                return new RightTriangle(randomColor, firstLeg, secondLeg);
            case CIRCLE:
            default:
                int radius = random.nextInt();
                return new Circle(randomColor, radius);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
