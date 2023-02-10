package core.basesyntax.randomizers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.security.SecureRandom;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;
    private static final int BOUND = 50;
    private final SecureRandom random = new SecureRandom();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int i = random.nextInt(5);

        switch (i) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND));
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND));
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND),
                        random.nextInt(BOUND),
                        random.nextInt(BOUND));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND),
                        random.nextInt(BOUND));
            default:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND),
                        random.nextInt(BOUND));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
