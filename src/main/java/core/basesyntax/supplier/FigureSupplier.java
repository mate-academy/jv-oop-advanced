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
        Color randomColor = colorSupplier.getRandomColor();
        Figure randomFigure;
        switch (index) {
            case 0:
                double radius = getRandomValue();
                randomFigure = new Circle(randomColor, radius);
                break;
            case 1:
                double side = getRandomValue();
                randomFigure = new Square(randomColor, side);
                break;
            case 2:
                double firstBase = getRandomValue();
                double secondBase = getRandomValue();
                double height = getRandomValue();
                randomFigure = new IsoscelesTrapezoid(randomColor, firstBase, secondBase, height);
                break;
            case 3:
                double side1 = getRandomValue();
                double side2 = getRandomValue();
                randomFigure = new Rectangle(randomColor, side1, side2);
                break;
            case 4:
                double firstLeg = getRandomValue();
                double secondLeg = getRandomValue();
                randomFigure = new RightTriangle(randomColor, firstLeg, secondLeg);
                break;
            default:
                randomFigure = getDefaultFigure();
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);
    }

    private double getRandomValue() {
        final int maxBoundary = 100;
        return random.nextDouble(maxBoundary);
    }
}
