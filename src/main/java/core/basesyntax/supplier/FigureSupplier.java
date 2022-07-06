package core.basesyntax.supplier;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureIndex = new Random().nextInt(4);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomDouble());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDouble(),
                                                getRandomDouble(), getRandomDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomDouble(),
                                    getRandomDouble());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomDouble(),
                                        getRandomDouble());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

    private double getRandomDouble() {
        return new Random().nextInt();
    }
}
