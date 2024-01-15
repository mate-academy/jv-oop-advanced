package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static Random random = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();

    private static final int CIRCLE_RADIUS = 10;
    private static final int MAX_VALUE = 50;

    public Figure getRandomFigure() {
        int numberOfFigure = random.nextInt(ListOfFigures.values().length);
        switch (numberOfFigure) {
            case 0: return new Circle(
                    colorSupplier.getRandomColor(),
                    random.nextInt(MAX_VALUE)
            );
            case 1: return new IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    random.nextInt(MAX_VALUE),
                    random.nextInt(MAX_VALUE),
                    random.nextInt(MAX_VALUE)
            );
            case 2: return new Rectangle(
                    colorSupplier.getRandomColor(),
                    random.nextInt(MAX_VALUE),
                    random.nextInt(MAX_VALUE)
            );
            case 3: return new RightTriangle(
                    colorSupplier.getRandomColor(),
                    random.nextInt(MAX_VALUE),
                    random.nextInt(MAX_VALUE)
            );
            default: return new Square(
                    colorSupplier.getRandomColor(),
                    random.nextInt(MAX_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(FigureColor.WHITE.name(), CIRCLE_RADIUS);
    }
}
