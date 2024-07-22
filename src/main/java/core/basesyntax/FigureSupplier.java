package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE_LENGTH = 10;
    private static final double MAX_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10.0;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                double side = random.nextDouble() * MAX_SIDE_LENGTH;
                return new Square(color, side);
            case 1:
                double width = random.nextDouble() * MAX_SIDE_LENGTH;
                double height = random.nextDouble() * MAX_SIDE_LENGTH;
                return new Rectangle(color, width, height);
            case 2:
                double firstLeg = random.nextDouble() * MAX_SIDE_LENGTH;
                double secondLeg = random.nextDouble() * MAX_SIDE_LENGTH;
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                double radius = random.nextDouble() * MAX_RADIUS;
                return new Circle(color, radius);
            case 4:
                double base1 = random.nextDouble() * MAX_SIDE_LENGTH;
                double base2 = random.nextDouble() * MAX_SIDE_LENGTH;
                double trapezoidHeight = random.nextDouble() * MAX_SIDE_LENGTH;
                return new IsoscelesTrapezoid(color, base1, base2, trapezoidHeight);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

}
