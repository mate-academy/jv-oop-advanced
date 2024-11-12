package core.basesyntax.supplier;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "black";
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int FIGURES_TYPES = 5;
    private static final int PROPERTY_BOUND = 25;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random rand = new Random();

    public Figure getRandomFigure() {
        int someInt = rand.nextInt(FIGURES_TYPES);
        String color = colorSupplier.getRandomColor();
        return switch (someInt) {
            case 0 -> new Circle(color, rand.nextInt(PROPERTY_BOUND));
            case 1 -> new IsoscelesTrapezoid(
                    color, rand.nextInt(PROPERTY_BOUND),
                    rand.nextInt(PROPERTY_BOUND), rand.nextInt(PROPERTY_BOUND));
            case 2 -> new Rectangle(color, rand.nextInt(PROPERTY_BOUND),
                    rand.nextInt(PROPERTY_BOUND));
            case 3 -> new Square(color, rand.nextInt(PROPERTY_BOUND));
            default -> new RightTriangle(color, rand.nextInt(PROPERTY_BOUND),
                    rand.nextInt(PROPERTY_BOUND));
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

}
