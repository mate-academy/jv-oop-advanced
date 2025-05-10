package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int FIGURES_TO_CHOOSE = 5;
    private final Random random = new Random();
    private final Circle defaultFigure = new Circle(Color.WHITE.name(), 10.0);

    private final ColorSupplier cs = new ColorSupplier();

    public Figure getRandomFigure() {
        return switch (random.nextInt(FIGURES_TO_CHOOSE)) {
            case 0 -> new Circle(cs.getRandomColor(), random.nextDouble(10.0));
            case 1 -> new IsoscelesTrapezoid(cs.getRandomColor(), random.nextDouble(10.0),
                random.nextDouble(10.0), random.nextDouble(10.0));
            case 2 -> new Rectangle(cs.getRandomColor(), random.nextDouble(10.0),
                random.nextDouble(10.0));
            case 3 -> new RightTriangle(cs.getRandomColor(), random.nextDouble(10.0),
                random.nextDouble(10.0));
            case 4 -> new Square(cs.getRandomColor(), random.nextDouble(10.0));
            default -> defaultFigure;
        };
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
