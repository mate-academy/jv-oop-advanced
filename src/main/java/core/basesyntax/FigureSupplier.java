package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import core.basesyntax.interfaces.Figure;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_LENGTH = 10;
    private static final int FIGURE_COUNT = 5;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        Color color = colorSupplier.getRandomColor();

        double a = random.nextDouble() * MAX_LENGTH + 1;
        double b = random.nextDouble() * MAX_LENGTH + 1;
        double h = random.nextDouble() * MAX_LENGTH + 1;

        switch (figureType) {
            case 0:
                return new Square(color, a);
            case 1:
                return new Rectangle(color, a, b);
            case 2:
                return new Circle(color, a);
            case 3:
                return new RightTriangle(color, a, b);
            default:
                return new IsoscelesTrapezoid(color, a, b, h);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
