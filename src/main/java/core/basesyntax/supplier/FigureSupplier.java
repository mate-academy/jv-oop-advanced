package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_S = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figuresIndex = new Random().nextInt(4);
        switch (figuresIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomdouble(),
                        getRandomdouble(),
                        getRandomdouble());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomInt());
        }
    }

    private int getRandomInt() {
        return new Random().nextInt(100);
    }

    private double getRandomdouble() {
        return new Random().nextDouble();
    }

    public Figure getDefaultFigure() {
        return new Circle("White", DEFAULT_S);
    }
}
