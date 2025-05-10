package core.basesyntax;

import core.basesyntax.enums.Colors;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;
    public static final int BOUND = 100;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0: return setCircle();
            case 1: return setRectangle();
            case 2: return setSquare();
            case 3: return setIsoscelesTrapezoid();
            case 4: return setRightTriangle();
            default: return getDefaultFigure();
        }
    }

    public Circle setCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND));
    }

    public Square setSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(BOUND));
    }

    public IsoscelesTrapezoid setIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                random.nextInt(BOUND), random.nextInt(BOUND));
    }

    public Rectangle setRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                random.nextInt(BOUND));
    }

    public RightTriangle setRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                random.nextInt(BOUND));
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }
}
