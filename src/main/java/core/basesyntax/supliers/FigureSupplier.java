package core.basesyntax.supliers;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int type = random.nextInt(5);
        return switch (type) {
            case 0 -> new Circle();
            case 1 -> new Square();
            case 2 -> new Rectangle();
            case 3 -> new RightTriangle();
            case 4 -> new IsoscelesTrapezoid();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10);
    }
}
