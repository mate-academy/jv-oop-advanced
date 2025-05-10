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
    private static final int AMOUNT_OF_FIGURES = 5;
    private static final int MAX_LENGTH = 25;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.getColor(), DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(AMOUNT_OF_FIGURES);
        String color = colorSupplier.getRandomColor();
        switch (randomIndex) {
            case 0:
                return new Circle(color, getRandomUnits());
            case 1:
                return new IsoscelesTrapezoid(color, getRandomUnits(),
                        getRandomUnits(), getRandomUnits());
            case 2:
                return new Rectangle(color, getRandomUnits(), getRandomUnits());
            case 3:
                return new RightTriangle(color, getRandomUnits(),getRandomUnits());
            case 4:
                return new Square(color, getRandomUnits());
            default:
                return getDefaultFigure();
        }
    }

    private int getRandomUnits() {
        return random.nextInt(MAX_LENGTH);
    }
}
