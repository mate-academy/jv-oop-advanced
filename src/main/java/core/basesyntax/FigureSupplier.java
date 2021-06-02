package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        final int figureCount = 5;
        final int Quasy = 41;
        final int defaultSide = 10;
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (random.nextInt(Quasy) % figureCount) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                            random.nextInt(defaultSide) + 1);
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor(),
                          random.nextInt(defaultSide) + 1,
                        random.nextInt(defaultSide) + 1);
            case 2:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(defaultSide) + 1);
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                               random.nextInt(defaultSide) + 1,
                                    random.nextInt(defaultSide) + 1);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                          random.nextInt(defaultSide) + 1,
                        random.nextInt(defaultSide) + 1, random.nextInt(defaultSide) + 1);
        }
    }
}
