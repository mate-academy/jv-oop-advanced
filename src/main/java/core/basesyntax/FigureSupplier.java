package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int LIMIT_SIZE = 100;
    private static final int NUM_OF_FIGURES = 4;

    public Figure getFigure() {
        Random random = new Random();
        int figure = random.nextInt(NUM_OF_FIGURES);
        switch (figure) {
            case 0:
                return new Circle(new ColorSupplier().getColor(),
                        random.nextInt(LIMIT_SIZE));
            case 1:
                return new Rectangle(new ColorSupplier().getColor(),
                        random.nextInt(LIMIT_SIZE),
                        random.nextInt(LIMIT_SIZE));
            case 2:
                return new IsoscelesTrapezoid(new ColorSupplier().getColor(),
                        random.nextInt(LIMIT_SIZE),
                        random.nextInt(LIMIT_SIZE),
                        random.nextInt(LIMIT_SIZE));
            case 3:
                return new RightTriangle(new ColorSupplier().getColor(),
                        random.nextInt(LIMIT_SIZE));
            default:
                return new Square(new ColorSupplier().getColor(),
                        random.nextInt(LIMIT_SIZE)); }
    }
}
