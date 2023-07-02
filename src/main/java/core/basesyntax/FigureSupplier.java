package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int figures = 5;
    private final int maxValue = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle("white", 10.00);
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(figures);
        switch (figureIndex) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(maxValue));
            case 2:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(maxValue));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(maxValue), random.nextInt(maxValue));
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(maxValue), random.nextInt(maxValue));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(maxValue), random.nextInt(maxValue),
                        random.nextInt(maxValue));
        }
    }
}
