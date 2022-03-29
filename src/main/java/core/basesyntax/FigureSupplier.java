package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int UPPER_BOUND = Figures.values().length;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final int BoundSide = 10;
        int randomSide = new Random().nextInt(BoundSide);

        String figure = Figures.values()[new Random()
                .nextInt(UPPER_BOUND)].toString().toLowerCase();
        switch (figure) {
            case ("square"):
                return new Square(randomSide, colorSupplier.getRandomColor());
            case ("right_triangle"):
                return new RightTriangle(randomSide, randomSide, colorSupplier.getRandomColor());
            case ("rectangle"):
                return new Rectangle(randomSide, randomSide, colorSupplier.getRandomColor());
            case ("isosceles_trapezoid"):
                return new IsoscelesTrapezoid(randomSide, randomSide, randomSide,
                        colorSupplier.getRandomColor());
            case ("circle"):
                return new Circle(randomSide, colorSupplier.getRandomColor());
            default: getDefaultFigure();
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
