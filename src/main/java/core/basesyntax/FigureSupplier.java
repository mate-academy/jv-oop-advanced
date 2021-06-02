package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier randomColor = new ColorSupplier();
        Random randomIndex = new Random();

        switch (randomIndex.nextInt(5)) {
            case 0:
                return new Circle(randomColor.getRandomColor(),
                        getRandomDouble());
            case 1:
                return new RightTriangle(randomColor.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 2:
                return new Rectangle(randomColor.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new Square(randomColor.getRandomColor(),
                        getRandomDouble());
            default:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
        }
    }

    public double getRandomDouble() {
        return (new Random().nextInt(1000) + 100) / 100.0;
    }
}
