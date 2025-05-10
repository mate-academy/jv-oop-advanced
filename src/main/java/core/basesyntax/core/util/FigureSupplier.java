
package core.basesyntax.core.util;

import core.basesyntax.core.figure.Circle;
import core.basesyntax.core.figure.Figure;
import core.basesyntax.core.figure.IsoscelesTrapezoid;
import core.basesyntax.core.figure.Rectangle;
import core.basesyntax.core.figure.RightTriangle;
import core.basesyntax.core.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 20;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int type = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        return switch (type) {
            case 0 -> new Square(color, random.nextInt(MAX_SIZE) + 1);
            case 1 -> new Rectangle(color, random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1);
            case 2 -> new RightTriangle(color, random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1);
            case 3 -> new Circle(color, random.nextInt(MAX_SIZE) + 1);
            default -> new IsoscelesTrapezoid(color, random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1, random.nextInt(MAX_SIZE) + 1);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
