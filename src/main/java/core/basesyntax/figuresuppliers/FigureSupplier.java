package core.basesyntax.figuresuppliers;

import core.basesyntax.color.Color;
import core.basesyntax.color.ColorSupplier;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_EDGE = 10;
    private static final int ANNEX = 1;
    private static final int DEFAULT_RADIUS = 10;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int sizeOne = getSize();
        int index = new Random().nextInt(FigureType.values().length);
        FigureType figureType = FigureType.values()[index];
        Color randomColor = colorSupplier.getRandomColor();

        switch (figureType) {
            case SQUARE:
                return new Square(randomColor, sizeOne);
            case RECTANGLE:
                int sizeTwo = getSize();
                return new Rectangle(randomColor, sizeOne, sizeTwo);
            case RIGHT_TRIANGLE:
                sizeTwo = getSize();
                return new RightTriangle(randomColor, sizeOne, sizeTwo);
            case CIRCLE:
                return new Circle(randomColor, sizeOne);
            case ISOSCELES_TRAPEZOID:
                sizeTwo = getSize();
                int sizeThree = getSize();
                return new IsoscelesTrapezoid(randomColor,
                        sizeOne, sizeTwo, sizeThree);
            default:
                return getDefaultFigure();
        }
    }

    private int getSize() {
        return random.nextInt(MAX_EDGE) + ANNEX;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
