package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Figure figure;
        int index = random.nextInt(AllFigures.values().length);
        switch (AllFigures.values()[index]) {
            case CIRCLE:
                figure = new Circle(colorSupplier.getRandomColor(), random.nextInt());
                break;
            case ISOSCELESTRAPEZOID:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(),
                        random.nextInt(), random.nextInt());
                break;
            case RECTANGLE:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(), random.nextInt());
                break;
            case RIGHTTRIANGLE:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(), random.nextInt());
                break;
            default:
                figure = new Square(colorSupplier.getRandomColor(), random.nextInt());
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
