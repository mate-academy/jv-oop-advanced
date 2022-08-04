package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int UPPER_BOUND = 10;
    private static final int NUMBER_OF_FIGURES = 4;
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Random random = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureNumber = random.nextInt(NUMBER_OF_FIGURES);
        switch (figureNumber) {
            case 0:
                return new Square("Square", color, random.nextInt(UPPER_BOUND));

            case 1:
                return new RightTriangle("Right Triangle", color,
                        random.nextInt(UPPER_BOUND),
                        random.nextInt(UPPER_BOUND));

            case 2:
                return new Rectangle("Rectangle", color,
                        random.nextInt(UPPER_BOUND),
                        random.nextInt(UPPER_BOUND));

            case 3:
                return new IsoscelesTrapezoid("Isosceles Trapezoid", color,
                        random.nextInt(UPPER_BOUND),
                        random.nextInt(UPPER_BOUND),
                        random.nextInt(UPPER_BOUND));

            default:
                return new Circle("Circle", DEFAULT_COLOR, DEFAULT_RADIUS);

        }
    }

    public Figure getDefaultFigure() {

        return new Circle("Circle ", DEFAULT_COLOR, DEFAULT_RADIUS);

    }

}
