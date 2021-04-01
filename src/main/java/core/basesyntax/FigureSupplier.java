package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int VALUE_COUNT = 10;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure createRandomFigure() {
        Random random = new Random();
        String color = colorSupplier.generateRandomColor();

        int valueFigure = random.nextInt(VALUE_COUNT);
        switch (valueFigure) {
            case 0 :
                return new Square(random.nextInt(FIGURE_COUNT),
                        color, "Square");
            case 1:
                return new Circle(random.nextInt(FIGURE_COUNT),
                        "Circle", color);
            case 2:
                return new Rectangle(random.nextInt(FIGURE_COUNT), random.nextInt(FIGURE_COUNT),
                        "Recatangle", color);
            case 3:
                return new RightTriangle(random.nextInt(FIGURE_COUNT), random.nextInt(FIGURE_COUNT),
                        "Right Triangle",
                        color);
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(FIGURE_COUNT),
                        random.nextInt(FIGURE_COUNT),
                        random.nextInt(FIGURE_COUNT),
                        "Isosceles Trapezoid", color);
            default:
                return new Square(random.nextInt(FIGURE_COUNT),
                        color, "Square");
        }

    }
}
