package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();

    public Figure getRandomFigure() {
        int indexFigure = random.nextInt(4);
        switch (indexFigure) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomDouble(), getRandomDouble());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomInt(), getRandomInt());
            case 3:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
            case 4:
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDouble(),
                        getRandomDouble(), getRandomDouble());
        }
    }

    private int getRandomInt() {
        return new Random().nextInt(100);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }
}
