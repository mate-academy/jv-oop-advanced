package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.misc.ColorSupplier;
import core.basesyntax.misc.Figures;
import java.util.Random;

public class FigureSupplier {
    private static final int UNITS = 100;
    private Random random = new Random();
    private ColorSupplier colorSupply = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(Figures.values().length);
        int r1 = random.nextInt(UNITS);
        int r2 = random.nextInt(UNITS);
        int r3 = random.nextInt(UNITS);
        String color = colorSupply.getRandomColor();
        Figures type = Figures.values()[index];
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
                return new IsoscelesTrapezoid(color, typeName,
                        r1, r2, r3);
            default:
                throw new IllegalArgumentException(type + " is not implemented");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", "circle", 10);
    }
}
