package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int maxNumber = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        FigureType randomFigure = FigureType.values()[random.nextInt(FigureType.values().length)];
        switch (randomFigure) {
            case Circle:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(maxNumber));
            case Square:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(maxNumber));
            case Rectangle:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(maxNumber),
                        random.nextInt(maxNumber));
            case RightTriangle:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(maxNumber),
                        random.nextInt(maxNumber));
            case IsoscelesTrapezoid:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(maxNumber),
                        random.nextInt(maxNumber),
                        random.nextInt(maxNumber));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.white,10);
    }

}
