package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int VALUE_COUNT = 10;

    public Figure createRandomFigure() {
        Random random = new Random();

        int valueFigure = random.nextInt(VALUE_COUNT);
        switch (valueFigure) {
            case 0 :
                return new Square(random.nextInt(FIGURE_COUNT),
                        ColorSupplier.colorsFigure(), "Square");
            case 1:
                return new Circle(random.nextInt(FIGURE_COUNT),
                        "Circle", ColorSupplier.colorsFigure());
            case 2:
                return new Rectangle(random.nextInt(FIGURE_COUNT), random.nextInt(FIGURE_COUNT),
                        "Recatangle", ColorSupplier.colorsFigure());
            case 3:
                return new RightTriangle(random.nextInt(FIGURE_COUNT), random.nextInt(FIGURE_COUNT),
                        "Right Triangle",
                        ColorSupplier.colorsFigure());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(FIGURE_COUNT),
                        random.nextInt(FIGURE_COUNT),
                        random.nextInt(FIGURE_COUNT),
                        "Isosceles Trapezoid", ColorSupplier.colorsFigure());
            default:
                return new Square(random.nextInt(FIGURE_COUNT),
                        ColorSupplier.colorsFigure(), "Square");
        }

    }
}
