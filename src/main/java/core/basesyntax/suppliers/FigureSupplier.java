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
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

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
                random.nextInt(100));
    }

    public Square getSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(100));
    }

    public Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(100),
                random.nextInt(100));
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(100),
                random.nextInt(100));
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name().toLowerCase(),10);
    }
}
