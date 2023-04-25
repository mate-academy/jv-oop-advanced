package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int MAX_NUMBER_OF_FIGURES = 5;
    public static final double MAX_SIZE = 100d;
    public static final double DEFAULT_RADIUS_OF_CIRCLE = 10d;
    public static final String DEFAULT_COLOR = "white";

    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_NUMBER_OF_FIGURES)) {
            case 0:
                double radius = random.nextDouble() * MAX_SIZE;
                return new Circle(colorSupplier.getRandomColor(), radius);
            case 1:
                double topSide = random.nextDouble() * MAX_SIZE;
                double bottomSide = random.nextDouble() * MAX_SIZE;
                double hight = random.nextDouble() * MAX_SIZE;
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        topSide,
                        bottomSide,
                        hight);
            case 2:
                double sideA = random.nextDouble() * MAX_SIZE;
                double sideB = random.nextDouble() * MAX_SIZE;
                return new Rectangle(colorSupplier.getRandomColor(),
                        sideA,
                        sideB);
            case 3:
                double firstLeg = random.nextDouble() * MAX_SIZE;
                double secondLeg = random.nextDouble() * MAX_SIZE;
                return new RightTriangle(colorSupplier.getRandomColor(),
                        firstLeg,
                        secondLeg);
            default:
                double side = random.nextDouble() * MAX_SIZE;
                return new Square(colorSupplier.getRandomColor(),
                        side);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS_OF_CIRCLE);
    }
}
