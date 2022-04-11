package core.basesyntax.supplier;

import core.basesyntax.model.*;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(4);
            switch (figureIndex) {
                case 0:
                    return new Circle(10, colorSupplier.getRandomColor());
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
                    return new RightTriangle(colorSupplier.getRandomColor(),
                            getRandomDouble(),
                            getRandomDouble());
                case 4:
                    return new Square(colorSupplier.getRandomColor(), getRandomDouble());
                default:
                    return getDefaultFigure();

            }
    }

     private int getRandomInt() {
         return new Random().nextInt(100);
     }

     private double getRandomDouble() {
        return new Random().nextDouble();
     }

     private Figure getDefaultFigure() {
         return new Circle(10, Color.WHITE.name());
     }
}
