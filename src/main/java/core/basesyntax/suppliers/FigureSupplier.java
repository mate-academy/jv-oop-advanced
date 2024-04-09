package core.basesyntax.suppliers;

import core.basesyntax.Color;
import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(1,6)) {
            case 1: return new Circle(randomDouble(1, 10), ColorSupplier.getRandomColor());
            case 2: return new IsoscelesTrapezoid(randomDouble(6, 10), randomDouble(7, 10),
                    randomDouble(3, 6), ColorSupplier.getRandomColor());
            case 3:
                double sideA = randomDouble(5, 10);
                double sideB = randomDouble(5, 10);;
                while (sideA == sideB) {
                    sideA = randomDouble(5, 10);
                }
                return new Rectangle(sideA, sideB, ColorSupplier.getRandomColor());
            case 4: return new RightTriangle(randomDouble(1, 10), ColorSupplier.getRandomColor());
            case 5: return new Square(randomDouble(1, 10), ColorSupplier.getRandomColor());
            default: break;
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.values()[0].toString());
    }

    public double randomDouble(double min, double max) {
        return Math.floor((min + random.nextDouble() * (max - min)) * 100) / 100;
    }
}
