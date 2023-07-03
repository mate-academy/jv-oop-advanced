package core.basesyntax.suppliers;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final Color defaultColor = Color.WHITE;
    private final int defaultRadius = 10;
    private final int numberOfFigures = 5;
    private final int maxNumber = 30;

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }

    public int getRandomSize() {
        return random.nextInt(maxNumber);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(numberOfFigures);
        switch (index) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),getRandomSize());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),getRandomSize(),
                        getRandomSize(),getRandomSize());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomSize(),getRandomSize());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomSize());
            case 4:
                return new Circle(colorSupplier.getRandomColor(),getRandomSize());
            default:
                return getDefaultFigure();
        }
    }
}
