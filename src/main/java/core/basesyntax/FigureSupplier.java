package core.basesyntax;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier extends ColorSupplier {

    private static final int MAX_SIDE = 10;
    private static final int INDEX = 4;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final FigureColor DEFAULT_CIRCLE_COLOR = FigureColor.WHITE;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = random.nextInt(INDEX);
        switch (index) {
            case 1:
                return new Square(random.nextInt(MAX_SIDE),
                        colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(random.nextInt(MAX_SIDE),
                        random.nextInt(MAX_SIDE),
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextInt(MAX_SIDE),
                        colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(MAX_SIDE),
                        random.nextInt(MAX_SIDE), random.nextInt(MAX_SIDE),
                        colorSupplier.getRandomColor());
            default:
                return new RightTriangle(random.nextInt(MAX_SIDE),
                        random.nextInt(MAX_SIDE),
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
    }
}
