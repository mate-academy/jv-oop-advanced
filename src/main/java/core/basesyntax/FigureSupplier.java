package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();

    private double getRandomValue() {
        return Math.abs(random.nextInt());
    }

    private Color getRandomColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }

    private Figure [] getFigure() {
        Figure [] figures = {
                new Circle(getRandomColor(), getRandomValue()),
                new IsoscelesTrapezoid(getRandomColor(),
                        getRandomValue(),
                        getRandomValue(),
                        getRandomValue()),
                new Rectangle(getRandomColor(), getRandomValue(), getRandomValue()),
                new RightTriangle(getRandomColor(), getRandomValue(), getRandomValue()),
                new Square(getRandomColor(), getRandomValue()),
                new Circle(getRandomColor(), getRandomValue())};
        return figures;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(getFigure().length);
        switch (index) {
            case 0: return getFigure()[0];
            case 1: return getFigure()[1];
            case 2: return getFigure()[2];
            case 3: return getFigure()[3];
            case 4: return getFigure()[4];
            case 5: return getFigure()[5];
            default: return null;
        }
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
        return defaultFigure;
    }
}
