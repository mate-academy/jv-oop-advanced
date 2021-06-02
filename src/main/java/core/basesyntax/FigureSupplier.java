package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURECOUNT = 5;
    private static final int DEFAULTSIDE = 10;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (random.nextInt(FIGURECOUNT)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                            random.nextInt(DEFAULTSIDE) + 1);
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor(),
                          random.nextInt(DEFAULTSIDE) + 1,
                        random.nextInt(DEFAULTSIDE) + 1);
            case 2:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(DEFAULTSIDE) + 1);
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                               random.nextInt(DEFAULTSIDE) + 1,
                                    random.nextInt(DEFAULTSIDE) + 1);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                          random.nextInt(DEFAULTSIDE) + 1,
                        random.nextInt(DEFAULTSIDE) + 1, random.nextInt(DEFAULTSIDE) + 1);
        }
    }
}
