package core.basesyntax.supplier;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int radius = 10;
    private final int number = 8;
    private final int enumber = 8;

    public Figure getRandomFigure() {
        switch (random.nextInt(enumber) + 1) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(number) + 1);
            case 2:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(number) + 1);
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(number) + 1,
                        random.nextInt(number) + 1);
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(number) + 1,
                        random.nextInt(number) + 1);
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(number) + 1,random.nextInt(number) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getRandomColor(), radius);
    }
}
