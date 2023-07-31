package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double CIRCLE_RADIUS = 10;
    private static final String CIRCLE_COLOR = Color.WHITE.name();
    private Random random = new Random();
    private Figures[] figures = Figures.values();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(figures.length);
        String randomColor = colorSupplier.getRandomColor();
        switch (figures[randomIndex]) {
            case CIRCLE:
                double randomRadius = random.nextDouble();
                return new Circle(randomColor, randomRadius);
            case SQUARE:
                double randomSideSize = random.nextDouble();
                return new Square(randomColor, randomSideSize);
            case RECTANGLE:
                double randomSide1 = random.nextDouble();
                double randomSide2 = random.nextDouble();
                return new Rectangle(randomColor, randomSide1, randomSide2);
            case RIGHT_TRIANGLE:
                double randomFirstLeg = random.nextDouble();
                double randomSecondLeg = random.nextDouble();
                return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
            default:
                double randomLowerBaseSide = random.nextDouble();
                double randomUpperBaseSide = random.nextDouble();
                double height = random.nextDouble();
                return new IsoscelesTrapezoid(randomColor, randomLowerBaseSide,
                        randomUpperBaseSide, height);
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_COLOR, CIRCLE_RADIUS);
    }
}
