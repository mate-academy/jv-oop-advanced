package core.basesyntax.supplier;
import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(4);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomDouble());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDouble(), getRandomDouble(), getRandomDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomDouble(), getRandomDouble());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomDouble(), getRandomDouble());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHIGTH", 10.0);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }
}