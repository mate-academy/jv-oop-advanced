package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int UPPER_BOUND = Figures.values().length;

    private static final int BOUND_FOR_SIDE = 10;
    private int randomSide = new Random().nextInt(BOUND_FOR_SIDE);

    private ColorSupplier cs = new ColorSupplier();

    public Figure getRandomFigure() {
        String figure = Figures.values()[new Random()
                .nextInt(UPPER_BOUND)].toString().toLowerCase();
        switch (figure) {
            case ("square"):
                return new Square(randomSide, cs.getRandomColor());
            case ("right_triangle"):
                return new RightTriangle(randomSide, randomSide, cs.getRandomColor());
            case ("rectangle"):
                return new Rectangle(randomSide, randomSide, cs.getRandomColor());
            case ("isosceles_trapezoid"):
                return new IsoscelesTrapezoid(randomSide, randomSide, randomSide, cs
                        .getRandomColor());
            case ("circle"):
                return new Circle(randomSide, cs.getRandomColor());
            default: getDefaultFigure();
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
