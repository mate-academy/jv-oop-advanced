package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_SIZE = 10;
    public static final int FIGURE_COUNT = 4;

    public Figure getDefaultFigure() {
        return new Circle("WHITE", MAX_SIZE);
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Circle(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIZE));
            case 1:
                return new Square(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIZE));
            case 2:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 3:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            default:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
        }
    }
}
