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

    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_NUMBER_OF_FIGURES)) {
            case 0:
                double radius = randomDouble();
                return new Circle(colorSupplier.getRandomColor(), radius);
            case 1:
                double topSide = randomDouble();
                double bottomSide = randomDouble();
                double hight = randomDouble();
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        topSide,
                        bottomSide,
                        hight);
            case 2:
                double sideA = randomDouble();
                double sideB = randomDouble();
                return new Rectangle(colorSupplier.getRandomColor(),
                        sideA,
                        sideB);
            case 3:
                double firstLeg = randomDouble();
                double secondLeg = randomDouble();
                return new RightTriangle(colorSupplier.getRandomColor(),
                        firstLeg,
                        secondLeg);
            default:
                double side = randomDouble();
                return new Square(colorSupplier.getRandomColor(),
                        side);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS_OF_CIRCLE);
    }

    private double randomDouble() {
        return random.nextDouble() * MAX_SIZE;
    }
}
