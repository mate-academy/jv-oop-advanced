package core.basesyntax.Suppliers;

import core.basesyntax.Model.Circle;
import core.basesyntax.Model.Figures;
import core.basesyntax.Model.IsoscelesTrapezoid;
import core.basesyntax.Model.Rectangle;
import core.basesyntax.Model.RightTriangle;
import core.basesyntax.Model.Square;
import java.util.Random;

public class FigureSupplier {
    protected ColorSupplier colorSupplier = new ColorSupplier();

    public Figures getRandomFigure() {
        int figureIndex = new Random().nextInt(4);
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
        return new Random().nextInt(50);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }
}

