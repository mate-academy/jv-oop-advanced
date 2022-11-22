package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_PROPERTY = 30;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.RED, 10);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        Color color = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                return new RightTriangle(color, random.nextInt(FIGURE_PROPERTY),
                        random.nextInt(FIGURE_PROPERTY));
            case 1:
                return new Circle(color, random.nextInt(FIGURE_PROPERTY));
            case 2:
                return new IsoscelesTrapezoid(color, random.nextInt(FIGURE_PROPERTY),
                        random.nextInt(FIGURE_PROPERTY), random.nextInt(FIGURE_PROPERTY));
            case 3:
                return new Rectangle(color, random.nextInt(FIGURE_PROPERTY),
                        random.nextInt(FIGURE_PROPERTY));
            case 4:
                return new Square(color, random.nextInt(FIGURE_PROPERTY));
            default:
                return getDefaultFigure();
        }
    }
}
