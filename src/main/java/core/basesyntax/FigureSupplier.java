package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_BOUND = 4;
    private static final int EXAMPLE_BOUND = 100;
    private static final int CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_BOUND);
        String color = colorSupplier.getRandomColor();
        switch (figureNumber) {
            case 0:
                return new Square(color, random.nextInt(EXAMPLE_BOUND));
            case 1:
                return new Rectangle(color, random.nextInt(EXAMPLE_BOUND),
                        random.nextInt(EXAMPLE_BOUND));
            case 2:
                return new RightTriangle(color, random.nextInt(EXAMPLE_BOUND),
                        random.nextInt(EXAMPLE_BOUND));
            case 3:
                return new Circle(color, random.nextInt(EXAMPLE_BOUND));
            case 4:
                return new IsoscelesTrapezoid(color, random.nextInt(EXAMPLE_BOUND),
                        random.nextInt(EXAMPLE_BOUND), random.nextInt(EXAMPLE_BOUND));
            default: break;
        }
        return new Square();
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), CIRCLE_RADIUS);
    }
}
