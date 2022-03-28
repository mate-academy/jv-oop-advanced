package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int UPPER_BOUND = 100;
    private static final int RADIUS_DEFAULT = 10;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String[] figure = new String[]{"square", "rectangle", "circle",
                "right triangle", "isosceles trapezoid"};
        int indexOfFigureArray = (int) Math.floor(Math.random() * figure.length);
        ColorSupplier colorSupplier = new ColorSupplier();
        String figureColor = colorSupplier.getRandomColor();
        switch (figure[indexOfFigureArray]) {
            case ("square"):
                int squareSide = random.nextInt(UPPER_BOUND);
                return new Square(figureColor, squareSide);
            case ("rectangle"):
                int rectangleFirstSide = random.nextInt(UPPER_BOUND);
                int rectangleSecondSide = random.nextInt(UPPER_BOUND);
                return new Rectangle(figureColor, rectangleFirstSide, rectangleSecondSide);
            case ("circle"):
                int radius = random.nextInt(UPPER_BOUND);
                return new Circle(figureColor, radius);
            case ("right triangle"):
                int firstleg = random.nextInt(UPPER_BOUND);
                int secondleg = random.nextInt(UPPER_BOUND);
                return new RightTriangle(figureColor, firstleg, secondleg);
            default:
                int upperBase = random.nextInt(UPPER_BOUND);
                int lowerBase = random.nextInt(UPPER_BOUND);
                int trapezoidSide = random.nextInt(UPPER_BOUND);
                return new IsoscelesTrapezoid(figureColor, upperBase, lowerBase, trapezoidSide);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", RADIUS_DEFAULT);
    }
}

