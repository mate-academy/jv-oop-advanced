package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.Shape;
import core.basesyntax.figures.*;
import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 10;
    private static final int START = 1;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    public Figure getRandomFigure() {
        int index = new Random().nextInt(Shape.values().length);
        Shape figure = Shape.values()[index];
        Color color = colorSupplier.getRandomColor();

        switch (figure) {
            case Square:
                double side = random.nextInt(BOUND) + START;
                return new Square(color, side);
            case Rectangle:
                double height = random.nextInt(BOUND) + START;
                double width = random.nextInt(BOUND) + START;
                return new Rectangle(color, width, height);
            case RightTriangle:
                double firstLeg = random.nextInt(BOUND) + START;
                double secondLeg = random.nextInt(BOUND) + START;
                return new RightTriangle(color, firstLeg, secondLeg);
            case IsoscelesTrapezoid:
                double lowerBase = random.nextInt(BOUND) + START;
                double upperBase = random.nextInt(BOUND) + START;
                side = random.nextInt(BOUND) + START;
                return new IsoscelesTrapezoid(color, lowerBase, upperBase, side);
            default:
                double radius = random.nextInt(BOUND) + START;
                return new Circle(color, radius);
        }
    }
}
