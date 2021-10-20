package core.basesyntax.figure;

import core.basesyntax.figuretype.Circle;
import core.basesyntax.figuretype.IsoscelesTrapezoid;
import core.basesyntax.figuretype.Rectangle;
import core.basesyntax.figuretype.RightTriangle;
import core.basesyntax.figuretype.Square;
import core.basesyntax.misc.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private static final int UNITS = 100;
    private Random random = new Random();
    private ColorSupplier colorSupply = new ColorSupplier();

    public Figure getRandomFigure() {
        int r1 = random.nextInt(UNITS);
        int r2 = random.nextInt(UNITS);
        int r3 = random.nextInt(UNITS);
        String color = colorSupply.getRandomColor();
        Figures type = Figures.values()[random.nextInt(Figures.values().length)];
        String typeName = type.toString().toLowerCase();
        switch (type) {
            case SQUARE:
                return new Square(color, typeName, r1);
            case RECTANGLE:
                return new Rectangle(color, typeName, r1, r2);
            case RIGHT_TRIANGLE:
                return new RightTriangle(color, typeName, r1, r2);
            case CIRCLE:
                return new Circle(color, typeName, r1);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(color, typeName, r1, r2, r3);
            default:
                throw new IllegalArgumentException(type + " is not implemented");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", "circle", 10);
    }
}
