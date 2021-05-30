package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        switch ((int) (Math.random() * 6)) {
            case 1:
                return new Circle(ColorSupplier.getRandomColor(), getRandomDouble());
            case 2:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new Rectangle(ColorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 4:
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 5:
                return new Square(ColorSupplier.getRandomColor(),
                        getRandomDouble());
            default:
                return getRandomFigure();
        }
    }

    private static double getRandomDouble() { // The method gives a beautiful value rounded to the hundredths
        return Math.round(Math.random() * 100000) / 100.0;
    }
}
