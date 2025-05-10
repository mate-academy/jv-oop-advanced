package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_FIGURE = 5;
    private static final int MAX_VALUE = 50;

    public Figure getRandomFigure() {
        Random random = new Random();
        int choose = random.nextInt(COUNT_FIGURE);

        switch (choose) {
            case 1:
                return new Square(ColorSupplier.color(),
                        random.nextInt(MAX_VALUE));
            case 2:
                return new Circle(ColorSupplier.color(),
                        random.nextInt(MAX_VALUE));
            case 3:
                return new Rectangle(ColorSupplier.color(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case 4:
                return new RightTriangle(ColorSupplier.color(),
                        random.nextInt(MAX_VALUE));
            case 5:
                return new IsoscelesTrapezoid(ColorSupplier.color(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            default:
                return new Rectangle(ColorSupplier.color(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));

        }
    }
}
