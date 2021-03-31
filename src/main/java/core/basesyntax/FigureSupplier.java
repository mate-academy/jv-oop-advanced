package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int RANDOM = 6;

    public static Figure randomFigure() {
        Random random = new Random();
        int number = random.nextInt(RANDOM);

        switch (number) {
            case 1:
                return new Circle(ColorSupplier.randomColor(), random.nextDouble());
            case 2:
                return new IsoscelesTrapezoid(ColorSupplier.randomColor(), random.nextDouble(),
                         random.nextDouble(), random.nextDouble());
            case 3:
                return new Rectangle(ColorSupplier.randomColor(),
                        random.nextDouble(), random.nextDouble());

            case 4:
                return new Square(ColorSupplier.randomColor(), random.nextDouble());
            case 5:
                return new RightTriangle(ColorSupplier.randomColor(),
                        random.nextDouble(), random.nextDouble());
            default:
                break;
        }
        return new Circle(ColorSupplier.randomColor(), random.nextDouble());
    }
}
