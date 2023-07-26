package core.basesyntax.supplier;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import core.basesyntax.service.Figure;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 6;
    private final Random random = new Random();
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[] {
                new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE)),
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE)),
                new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE)),
                new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE)),
                new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE))
        };

        int length = figures.length - 1;
        return figures[random.nextInt(length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
