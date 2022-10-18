package core.basesyntax.suppliers;

import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        int indexOfFigure = new Random().nextInt(4);
        switch (indexOfFigure) {
            case 0:
                return new Circle(new ColorSupplier().getRandomColor(), getRandomDouble());
            case 1:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
            case 2:
                return new Rectangle(new ColorSupplier().getRandomColor(), getRandomInt(), getRandomInt());
            case 3:
                return new RightTriangle(new ColorSupplier().getRandomColor(), getRandomDouble(), getRandomDouble());
            case 4:
            default:
                return new Square(new ColorSupplier().getRandomColor(), getRandomInt());
        }

    }

    public int getRandomInt() {
        return new Random().nextInt(100);
    }

    public double getRandomDouble() {
        return new Random().nextDouble();
    }

    public Figure getDefaultFigure() {
        String white = String.valueOf(Color.WHITE);
        return new Circle(white, 10.0);
    }
}
