package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();

        return switch (random.nextInt(5)) {
            case 0 -> new Circle(
                    color,
                    random.nextInt(MAX_SIZE) + 1
            );

            case 1 -> new Square(
                    color,
                    random.nextInt(MAX_SIZE) + 1
            );

            case 2 -> new Rectangle(
                    color,
                    random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1
            );

            case 3 -> new RightTriangle(
                    color,
                    random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1
            );

            default -> new IsoscelesTrapezoid(
                    color,
                    random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1
            );
        };
    }
}
