package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES = 6;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        Color randomColor = colorSupplier.getRandomColor();
        Figure figure = switch (random.nextInt(MAX_FIGURES) + 1) {
            case 1 -> new Circle(randomColor, getRandomLength());
            case 2 -> new IsoscelesTrapezoid(randomColor, getRandomLength(), getRandomLength(),
                    getRandomLength());
            case 3 -> new Rectangle(randomColor, getRandomLength(), getRandomLength());
            case 4 -> new RightTriangle(randomColor, getRandomLength(), getRandomLength());
            case 5 -> new Square(randomColor, getRandomLength());
            default -> getDefaultFigure();
        };
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public double getRandomLength() {
        return random.nextInt(100) + 1;
    }

}
