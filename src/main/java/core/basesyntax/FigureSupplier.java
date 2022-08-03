package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String COLOR = "WHITE";
    private static final int RADIUS = 10;
    private static final int FIGURE_COUNT = 4;
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Random random = new Random();

    public Figures getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        double sideA = random.nextInt(10);
        double sideB = random.nextInt(10);
        double height = random.nextInt(10);
        switch (figureNumber) {
            case 0:
                return new Square("Square", color, sideA);

            case 1:
                return new RightTriangle("Right Triangle", color, sideA, sideB);

            case 2:
                return new Rectangle("Rectangle", color, sideA, sideB);

            case 3:
                return new IsoscelesTrapezoid("Isosceles Trapezoid", color, sideA, height, sideB);

            default:
                return new Square("square", color, 42);

        }
    }

    public Figures getDefaultFigure() {

        return new Circle("Circle", COLOR, RADIUS);

    }

}
