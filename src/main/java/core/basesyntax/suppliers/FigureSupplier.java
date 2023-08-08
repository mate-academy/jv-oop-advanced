package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Color;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_LENGTH = 20;
    private static final int MIN_LENGTH = 1;
    private static final int NUMBER_OF_FIGURES = 5;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureIndex = random.nextInt(NUMBER_OF_FIGURES);

        switch (figureIndex) {
            case 0:
                return new Circle(color, getRandomLength());
            case 1:
                return new Square(color, getRandomLength());
            case 2:
                return new Rectangle(color, getRandomLength(), getRandomLength());
            case 3:
                return new RightTriangle(color, getRandomLength(), getRandomLength());
            case 4:
                return new IsoscelesTrapezoid(
                        color, getRandomLength(), getRandomLength(), getRandomLength()
                );
            default:
                return getDefaultFigure();
        }
    }

    private int getRandomLength() {
        return random.nextInt(MAX_LENGTH) + MIN_LENGTH;
    }
}
