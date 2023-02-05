package core.basesyntax.suppliers;

import core.basesyntax.base.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_PROPERTY_VALUE = 50;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final FigureType[] figureTypes = FigureType.values();
    private final int figureCount = figureTypes.length;

    private double getRandomProperty() {
        return (int) (Math.random() * MAX_PROPERTY_VALUE);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(figureCount);
        FigureType type = figureTypes[index];
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case CIRCLE:
                double radius = getRandomProperty();
                return new Circle(color, radius);
            case RECTANGLE:
                double firstSide = getRandomProperty();
                double secondSide = getRandomProperty();
                return new Rectangle(color, firstSide, secondSide);
            case SQUARE:
                double side = getRandomProperty();
                return new Square(color, side);
            case RIGHT_TRIANGLE:
                double firstLeg = getRandomProperty();
                double secondLeg = getRandomProperty();
                return new RightTriangle(color, firstLeg, secondLeg);
            case ISOSCELES_TRAPEZOID:
                double topBase = getRandomProperty();
                double bottomBase = getRandomProperty();
                double height = getRandomProperty();
                return new IsoscelesTrapezoid(color, topBase, bottomBase, height);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
