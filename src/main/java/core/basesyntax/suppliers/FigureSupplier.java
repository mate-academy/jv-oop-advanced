package core.basesyntax.suppliers;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int rangeOfRandom = 50;

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(4);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                    getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDouble(),
                    getRandomDouble(), getRandomDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                    getRandomInt(),
                    getRandomInt());
            case 3:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
            case 4:
            default:
                return new RightTriangle(colorSupplier.getRandomColor(),
                    getRandomInt(),
                    getRandomInt());
        }
    }

    private int getRandomInt() {
        return new Random().nextInt(rangeOfRandom);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }
}

