package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 5;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int MAX_BOUND = 100;
    private static final int MIN = 1;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private String randomFigureName;
    private Figure randomFigure;

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureEnumeration.values().length);
        randomFigureName = FigureEnumeration.values()[index].name();
        switch (randomFigureName) {
            case "ISOSCELES_TRAPEZOID":
                String trapezoidColor = colorSupplier.getRandomColor();
                int topSide = random.nextInt(MAX_BOUND) + MIN;
                int bottomSide = random.nextInt(MAX_BOUND) + MIN;
                int trapezoidHeight = random.nextInt(MAX_BOUND) + MIN;
                randomFigure = new IsoscelesTrapezoid(trapezoidColor,
                        topSide, bottomSide, trapezoidHeight);
                break;
            case "RECTANGLE":
                String rectangleColor = colorSupplier.getRandomColor();
                int firstSide = random.nextInt(MAX_BOUND) + MIN;
                int secondSide = random.nextInt(MAX_BOUND) + MIN;
                randomFigure = new Rectangle(rectangleColor, firstSide, secondSide);
                break;
            case "SQUARE":
                String squareColor = colorSupplier.getRandomColor();
                int side = random.nextInt(MAX_BOUND) + MIN;
                randomFigure = new Square(squareColor, side);
                break;
            case "RIGHT_TRIANGLE":
                String triangleColor = colorSupplier.getRandomColor();
                int firstLeg = random.nextInt(MAX_BOUND) + MIN;
                int secondLeg = random.nextInt(MAX_BOUND) + MIN;
                randomFigure = new RightTriangle(triangleColor, firstLeg, secondLeg);
                break;
            case "CIRCLE":
                String circleColor = colorSupplier.getRandomColor();
                int radius = random.nextInt(MAX_BOUND) + MIN;
                randomFigure = new Circle(circleColor, radius);
                break;
            default:
                System.out.println("Error");
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
