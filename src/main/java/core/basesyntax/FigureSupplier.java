package core.basesyntax;

import java.util.Random;

public class FigureSupplier implements ColorSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int FIGURE_PARAMETER = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private final Random random = new Random();

    public Figure getRandomFigure() {
        final String color = ColorSupplier.getRandomColor();
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return new Circle(random.nextInt(FIGURE_PARAMETER),color);

            case 1:
                return new IsoscelesTrapezoid(random.nextInt(FIGURE_PARAMETER),
                        random.nextInt(FIGURE_PARAMETER),random.nextInt(FIGURE_PARAMETER),color);

            case 2:
                return new Rectangle(random.nextInt(FIGURE_PARAMETER),
                         random.nextInt(FIGURE_PARAMETER),color);

            case 3:
                return new Square(random.nextInt(FIGURE_PARAMETER),color);

            case 4:
            default:
                return new RightTriangle(random.nextInt(FIGURE_PARAMETER),
                         random.nextInt(FIGURE_PARAMETER),color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS,DEFAULT_COLOR);
    }
}
