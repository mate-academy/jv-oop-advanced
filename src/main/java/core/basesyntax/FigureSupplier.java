package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int randNumber = 5;
    private static final int plus = 1;
    private static final int maxUnit = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int i = random.nextInt(randNumber);

        switch (i) {
            case 0:
                return new Circle(plus + random.nextInt(maxUnit), colorSupplier.getRandomColor());
            case 1:
                return new Square(plus + random.nextInt(maxUnit), colorSupplier.getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(plus + random.nextInt(maxUnit),plus
                        + random.nextInt(maxUnit),plus
                        + random.nextInt(maxUnit), colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(plus + random.nextInt(maxUnit),plus
                        + random.nextInt(maxUnit), colorSupplier.getRandomColor());
            default:
                return new Rectangle(plus + random.nextInt(maxUnit), plus + random.nextInt(maxUnit),
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(maxUnit, "white");
    }
}
