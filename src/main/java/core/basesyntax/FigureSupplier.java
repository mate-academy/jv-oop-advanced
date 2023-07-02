package core.basesyntax;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Color;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int AMOUNT_OF_FIGURES = 5;
    public static final int DIMENSION_UPPER_BOUND = 1000;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    public static final double DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(AMOUNT_OF_FIGURES);
        Color color = colorSupplier.getRandomColor();
        switch (index) {
            case 0 : return new Square(color, getLength());
            case 1 : return new Circle(color, getLength());
            case 2 : return new Rectangle(color, getLength(), getLength());
            case 3 : return new RightTriangle(color, getLength(), getLength());
            case 4 : return new IsoscelesTrapezoid(color, getLength(), getLength(), getLength());
            default: throw new IllegalStateException("Unexpected value: " + index);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getLength() {
        return random.nextInt(DIMENSION_UPPER_BOUND);
    }
}
