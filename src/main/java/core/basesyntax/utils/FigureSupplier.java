package core.basesyntax.utils;

import core.basesyntax.abstraction.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;

    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random) {
        this.random = random;
        this.colorSupplier = new ColorSupplier(random);
    }

    public Figure getRandomFigure() {
        int randomInt = random.nextInt(Figures.values().length);
        Figures figure = Figures.values()[randomInt];
        return getFigure(figure);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), 10);
    }

    public Figure getFigure(Figures figure) {
        String color = colorSupplier.getRandomColor();

        switch (figure) {
            case SQUARE:
                return new Square(color, getRandomNum());
            case RECTANGLE:
                return new Rectangle(color, getRandomNum(),
                        getRandomNum());
            case RIGHT_TRIANGLE:
                return new RightTriangle(color, getRandomNum(),
                        getRandomNum());
            case CIRCLE:
                return new Circle(color, getRandomNum());
            default:
                return new IsoscelesTrapezoid(color, getRandomNum(),
                        getRandomNum(), getRandomNum());
        }
    }

    private int getRandomNum() {
        return random.nextInt(MAX_VALUE);
    }
}
