package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figures getRandomFigure() {
        FigureType[] figureType = FigureType.values();
        switch (figureType[random.nextInt(figureType.length)]) {
            case CIRCLE:
                return createCircle(random.nextDouble());
            case ISOSCALESTRAPECOID:
                return createIsoscelesTrapezoid(random.nextDouble(),
                        random.nextDouble(), random.nextDouble());
            case RECTANGLE:
                return createRectangle(random.nextDouble(), random.nextDouble());
            case RIGHTTRIANGLE:
                return createRightTriangle(random.nextDouble(), random.nextDouble());
            default:
                return createSquare(random.nextDouble());
        }
    }

    public Figures getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR.name());
    }

    private Figures createCircle(double radius) {
        return new Circle(radius, colorSupplier.getRandomColor());
    }

    private Figures createIsoscelesTrapezoid(double firstLeg, double secondLeg, double height) {
        return new IsoscelesTrapezoid(firstLeg,
                secondLeg, height,
                colorSupplier.getRandomColor());
    }

    private Figures createRectangle(double firstLeg, double secondLeg) {
        return new Rectangle(firstLeg, secondLeg,
                colorSupplier.getRandomColor());
    }

    private Figures createRightTriangle(double firstLeg, double secondLeg) {
        return new RightTriangle(firstLeg, secondLeg, colorSupplier.getRandomColor());
    }

    private Figures createSquare(double radius) {
        return new Square(radius, colorSupplier.getRandomColor());
    }
}
