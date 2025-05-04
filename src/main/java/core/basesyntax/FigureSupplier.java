package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.interfaces.Figure;
import core.basesyntax.model.Circle;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_LENGTH = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        Color color = colorSupplier.getRandomColor();

        double a = random.nextDouble() * MAX_LENGTH + 1;
        double b = random.nextDouble() * MAX_LENGTH + 1;
        double h = random.nextDouble() * MAX_LENGTH + 1;

        return switch (figureType) {
            case 0 -> new Square(color, a);
            case 1 -> new Rectangle(color, a, b);
            case 2 -> new Circle(color, a);
            case 3 -> new RightTriangle(color, a, b);
            default -> new IsoscelesTrapezoid(color, a, b, h);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.RED, 7);
    }
}
