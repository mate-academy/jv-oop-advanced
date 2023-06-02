package core.basesyntax;

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
    private static final int MAX_VALUE = 1000;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        FigureType figureType = FigureType.values()[index];
        Color randomColor = colorSupplier.getRandomColor();

        if (figureType == FigureType.SQUARE) {
            return new Square(getRandomInt(), randomColor);
        } else if (figureType == FigureType.RECTANGLE) {
            return new Rectangle(getRandomInt(), getRandomInt(), randomColor);
        } else if (figureType == FigureType.RIGHTTRIANGLE) {
            return new RightTriangle(getRandomInt(), getRandomInt(), randomColor);
        } else if (figureType == FigureType.CIRCLE) {
            return new Square(getRandomInt(), randomColor);
        } else if (figureType == FigureType.ISOSCELESTRAPEZOID) {
            return new IsoscelesTrapezoid(getRandomInt(), getRandomInt(), getRandomInt(),
                    randomColor);
        } else {
            return getDefaultFigure();
        }
    }

    private int getRandomInt() {
        return random.nextInt(MAX_VALUE) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
