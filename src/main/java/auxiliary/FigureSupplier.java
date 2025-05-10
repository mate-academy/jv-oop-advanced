package auxiliary;

import core.basesyntax.Circle;
import core.basesyntax.IsoscelesTrapezoid;
import core.basesyntax.Rectangle;
import core.basesyntax.RightTriangle;
import core.basesyntax.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int VALUE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(TypeOfFigure.values().length)) {
            case 1: {
                return new Square(getRandNumber(), colorSupplier.getRandomColor());
            }
            case 2: {
                return new Circle(getRandNumber(), colorSupplier.getRandomColor());
            }
            case 3: {
                return new Rectangle(getRandNumber(), getRandNumber(),
                        colorSupplier.getRandomColor());
            }
            case 4: {
                return new RightTriangle(getRandNumber(), getRandNumber(),
                        colorSupplier.getRandomColor());
            }
            default: {
                return new IsoscelesTrapezoid(getRandNumber(), getRandNumber(),
                        colorSupplier.getRandomColor());
            }
        }
    }

    public Figure getDefFigure() {
        return new Circle(10, Color.WHITE.toString());
    }

    private int getRandNumber() {
        return random.nextInt(VALUE);
    }
}
