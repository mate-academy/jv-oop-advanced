package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_BOUND = 100;

    public Figure getRandomFigure() {
        switch (new Random().nextInt(5)) {
            case 0 :
                return new Square(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_BOUND));

            case 1 :
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_BOUND),
                        new Random().nextInt(MAX_BOUND));

            case 2 :
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_BOUND),
                        new Random().nextInt(MAX_BOUND));

            case 3 :
                return new Circle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_BOUND));

            case 4 :
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_BOUND),
                        new Random().nextInt(MAX_BOUND),
                        new Random().nextInt(MAX_BOUND));
            default:
                return new Figure(new ColorSupplier().getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString(), 10);
    }
}
