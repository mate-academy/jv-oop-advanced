package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        FigureList randomFigure = FigureList.values()[random.nextInt(FigureList.values().length)];
        int randomRange = 100;
        switch (randomFigure) {
            case Circle:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(randomRange));
            case Square:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(randomRange));
            case Rectangle:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(randomRange),
                        random.nextInt(randomRange));
            case RightTriangle:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(randomRange),
                        random.nextInt(randomRange));
            case IsoscelesTrapezoid:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(randomRange),
                        random.nextInt(randomRange),
                        random.nextInt(randomRange));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getDefaultColor(),10);
    }

}
