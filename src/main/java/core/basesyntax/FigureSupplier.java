package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final Random RANDOM = new Random();
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_BOUND = 30;
    public static final int RADIUS = 10;

    private int getBound() {
        return RANDOM.nextInt(MAX_BOUND) + 1;
    }

    public Figure getRandomFigure() {
        int figure = RANDOM.nextInt(FIGURE_COUNT) + 1;
        switch (figure) {
            case 1: {
                return new Circle(new ColorSupplier().getRandomColor(),
                        getBound());
            }
            case 2: {
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        getBound(), getBound(), getBound());
            }
            case 3: {
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        getBound(), getBound());
            }
            case 4: {
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        getBound(), getBound());
            }
            default: {
                return new Square(new ColorSupplier().getRandomColor(),
                        getBound());
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(FigureColor.WHITE.name(), RADIUS);
    }
}
