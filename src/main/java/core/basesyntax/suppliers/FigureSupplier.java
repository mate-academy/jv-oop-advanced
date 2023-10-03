package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_PROPERTY = 10;
    private static final int MAX_VALUE_OF_PROPERTY = 20;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private int getRandomProperty() {
        int x = random.nextInt(MAX_VALUE_OF_PROPERTY);
        return x != 0 ? x : DEFAULT_PROPERTY;
    }

    public Figure getRandomFigure() {

        final Random random = new Random();
        int randomIndex = random.nextInt(FigureType.values().length);
        switch (randomIndex) {
            case (0):
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomProperty());
            case (1):
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomProperty(),
                        getRandomProperty(),
                        getRandomProperty());
            case (2):
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomProperty(),
                        getRandomProperty());
            case (3):
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomProperty(),
                        getRandomProperty(),
                        getRandomProperty());
            default:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomProperty());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_PROPERTY);
    }
}
