package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final Random RANDOM = new Random();
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_BOUND = 30;
    public static final int RADIUS = 10;

    private String getColor() {
        return new ColorSupplier().getRandomColor();
    }

    private int getBound() {
        return RANDOM.nextInt(MAX_BOUND) + 1;
    }

    public Figure getRandomFigure() {
        int figure = RANDOM.nextInt(FIGURE_COUNT) + 1;
        switch (figure) {
            case 1: {
                return new Circle(getColor(), getBound());
            }
            case 2: {
                return new IsoscelesTrapezoid(getColor(), getBound(), getBound(), getBound());
            }
            case 3: {
                return new Rectangle(getColor(), getBound(), getBound());
            }
            case 4: {
                return new RightTriangle(getColor(), getBound(), getBound());
            }
            default: {
                return new Square(getColor(), getBound());
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(FigureColor.WHITE.name(), RADIUS);
    }
}
