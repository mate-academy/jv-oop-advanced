package core.basesyntax;

import core.basesyntax.fiqures.Circle;
import core.basesyntax.fiqures.IsoscelesTrapezoid;
import core.basesyntax.fiqures.Rectangle;
import core.basesyntax.fiqures.RightTriangle;
import core.basesyntax.fiqures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 4;
    private static final int MAX_SIZE = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = new Random().nextInt(MAX_VALUE);
        Figure figure;
        switch (figureNumber) {
            case 0:
                figure = new Circle(new Random().nextInt(MAX_SIZE));
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new IsoscelesTrapezoid(new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE));
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new Rectangle(new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE));
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new RightTriangle(new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE));
                figure.setColor(colorSupplier.getRandomColor());
                break;
            default:
                figure = new Square(new Random().nextInt(MAX_SIZE));
                figure.setColor(colorSupplier.getRandomColor());
                break;
        }
        return figure;
    }
}
