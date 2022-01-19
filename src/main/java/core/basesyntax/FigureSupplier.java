package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final int MAX_VALUE = 10;

    public Figure getDefaultFigure() {
        return new Circle("white", MAX_VALUE);
    }

    public Figure getRandomFigure() {
        switch (new Random().nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_VALUE));
            case 1:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_VALUE),
                        new Random().nextInt(MAX_VALUE));
            case 2:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_VALUE),
                        new Random().nextInt(MAX_VALUE));
            case 3: return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                    new Random().nextInt(MAX_VALUE),
                    new Random().nextInt(MAX_VALUE), new Random().nextInt(MAX_VALUE));
            default:
                return new Circle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_VALUE));
        }
    }
}


