package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Color;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_SIZE = 10;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Figure getRandomFigure() {
        final int numberOfClasses = 5;
        int index = random.nextInt(numberOfClasses);
        Color color = colorSupplier.getRandomColor();

        switch (index) {
            case 0:
                double radius = getRandomValues();
                return new Circle(color, radius);
            case 1:
                double side = getRandomValues();
                return new Square(color, side);
            case 2:
                double firstBase = getRandomValues();
                double secondBase = getRandomValues();
                double height = getRandomValues();
                return new IsoscelesTrapezoid(color, firstBase, secondBase, height);
            case 3:
                double side1 = getRandomValues();
                double side2 = getRandomValues();
                return new Rectangle(color, side1, side2);
            case 4:
                double firstLeg = getRandomValues();
                double secondLeg = getRandomValues();
                return new RightTriangle(color, firstLeg, secondLeg);
            default:
                return getDefaultFigure();
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);
    }

    private double getRandomValues() {
        int maxBoundary = 100;
        return this.random.nextDouble(maxBoundary);
    }
}
