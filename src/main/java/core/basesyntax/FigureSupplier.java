package core.basesyntax;

import core.basesyntax.figures.*;
import core.basesyntax.enums.Type;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX = 20;
    private static final int MIN = 1;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();


    public Figure getRandomFigure() {
        int indexOfType = random.nextInt(Type.values().length);
        Type type = Type.values()[indexOfType];
        String color = colorSupplier.getRandomColor();
        int sideA = random.nextInt(MIN, MAX);
        int sideB = random.nextInt(MIN, MAX);
        int sideC = random.nextInt(MIN, MAX);
        switch (type) {
            case SQUARE:
                return new Square(sideA, color);
            case RECTANGLE:
                return new Rectangle(sideA, sideB, color);
            case TRIANGLE:
                return new RightTriangle(sideA, sideB, color);
            case CIRCLE:
                return new Circle(sideA, color);
            default:
                return new IsoscelesTrapezoid(sideA, sideB, sideC, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS);
    }
}
