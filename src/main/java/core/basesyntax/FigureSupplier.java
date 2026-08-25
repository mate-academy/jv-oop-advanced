package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_RANDOM_VALUE = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        int parameter = random.nextInt(MAX_RANDOM_VALUE) + 1;

        switch (figureType) {
            case 0:
                return new Circle(color, parameter);
            case 1:
                return new RightTriangle(color, parameter, parameter);
            case 2:
                return new Rectangle(color, parameter, parameter);
            case 3:
                return new Square(color, parameter);
            case 4:
                return new IsoscelesTrapezoid(color, parameter, parameter, parameter);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

