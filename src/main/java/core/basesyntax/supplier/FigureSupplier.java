package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Circle circle = new Circle("WHITE", 10);

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(5);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandom());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new Square(colorSupplier.getRandomColor(), getRandom());
            case 4:
            default:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandom(),
                        getRandom());
        }
    }

    private int getRandom() {

        return new Random().nextInt(100);
    }

    private double getRandomDouble() {

        return new Random().nextDouble();
    }

    public Figure getDefaultFigure() {
        return circle;
    }
}
