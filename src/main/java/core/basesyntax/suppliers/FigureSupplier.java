package core.basesyntax.suppliers;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
private static ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

private static final Random RANDOM = new Random();

private static final int INDEX = 5;

private static final int SIDE_MAX = 100;

    public Figure getRandomFigure() {
        int figureIndex = RANDOM.nextInt(INDEX);
        switch (figureIndex) {
            case 0:
                return new Circle(COLOR_SUPPLIER.getRandomColor(), getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
            case 2:
                return new Rectangle(COLOR_SUPPLIER.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new RightTriangle(COLOR_SUPPLIER.getRandomColor(),
                        getRandomInt(),
                        getRandomInt());
            case 4:
                return new Square(COLOR_SUPPLIER.getRandomColor(), getRandomInt());
            default:
                return new Circle(COLOR_SUPPLIER.getRandomColor(), getRandomInt());
        }
    }
    
    private int getRandomInt() {
        return RANDOM.nextInt(SIDE_MAX);
    }

    private double getRandomDouble() {
        return RANDOM.nextDouble();
    }
}
