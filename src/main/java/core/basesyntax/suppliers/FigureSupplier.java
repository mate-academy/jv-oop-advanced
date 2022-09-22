package core.basesyntax.suppliers;

import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.Circle;
import core.basesyntax.model.Square;
import core.basesyntax.model.Figure;
import java.util.Random;

public class FigureSupplier {

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(4);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt(),
                        getRandomInt());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
        }
    }

    private int getRandomInt() {
        return new Random().nextInt(100);
    }
}
