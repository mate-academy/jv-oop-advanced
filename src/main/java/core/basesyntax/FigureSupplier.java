package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final double COEFFICIENT = 20.0;
    private static final String DEFAULT_COLOR = "white";
    private static final String DEFAULT_FIGURE_NAME = "Circle";
    private static final double DEFAULT_RADIUS = 10.0;

    private ColorSupplier colorSupplier;
    private Random random;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.random = new Random();
    }

    public Figure getRandomFigure() {
        String randomColor = this.colorSupplier.getRandomColor();
        int randomNumber = this.random.nextInt(FIGURE_TYPES_COUNT);
        switch (randomNumber) {
            case 0:
                double radius = random.nextDouble() * COEFFICIENT;
                return new Circle(
                        randomColor,
                        "Circle",
                        radius
                );
            case 1:
                double height = random.nextDouble() * COEFFICIENT;
                double base1 = random.nextDouble() * COEFFICIENT;
                double base2 = random.nextDouble() * COEFFICIENT;
                return new IsoscelesTrapezoid(
                    randomColor,
                    "IsoscelesTrapezoid",
                    height,
                    base1,
                    base2
            );
            case 2:
                double length = random.nextDouble() * COEFFICIENT;
                double width = random.nextDouble() * COEFFICIENT;
                return new Rectangle(
                    randomColor,
                    "Rectangle",
                    length,
                    width
            );
            case 3:
                double side = random.nextDouble() * COEFFICIENT;
                return new Square(
                    randomColor,
                    "Square",
                    side
            );
            case 4:
                double firstLeg = random.nextDouble() * COEFFICIENT;
                double secondLeg = random.nextDouble() * COEFFICIENT;
                return new RightTriangle(
                    randomColor,
                    "RightTriangle",
                        firstLeg,
                        secondLeg
            );
            default: return new Circle(DEFAULT_COLOR, DEFAULT_FIGURE_NAME, DEFAULT_RADIUS);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_FIGURE_NAME, DEFAULT_RADIUS);
    }

}
