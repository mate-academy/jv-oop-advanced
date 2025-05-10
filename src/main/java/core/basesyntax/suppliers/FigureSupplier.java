package core.basesyntax.suppliers;

import core.basesyntax.Colors;
import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final int DEFAULT_VALUE = 10;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(Colors.values().length)) {
            case 1:
                return getCircle();
            case 2:
                return getSquare();
            case 3:
                return getRectangle();
            case 4:
                return getRightTriangle();
            default:
                return getIsoscelesTrapezoid();
        }
    }

    public Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE));
    }

    public Square getSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE));
    }

    public Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name().toLowerCase(), DEFAULT_VALUE);
    }
}
