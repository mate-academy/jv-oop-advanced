package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_COUNT = 4;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),random.nextDouble(),
                        random.nextDouble(), random.nextDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(), random.nextInt());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(), random.nextInt());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
