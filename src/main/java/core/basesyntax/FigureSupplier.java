package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final int MAX_VALUE = 10;

    public Figure getDefaultFigure() {
        return new Circle("white", MAX_VALUE);
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_VALUE));
            case 1:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case 2:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case 3: return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                    random.nextInt(MAX_VALUE),
                    random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            default:
                return new Circle(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_VALUE));
        }
    }
}


