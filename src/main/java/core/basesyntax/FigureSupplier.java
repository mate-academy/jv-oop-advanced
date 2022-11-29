package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_ELEMENT_MAX_SIZE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_ELEMENT_MAX_SIZE));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_ELEMENT_MAX_SIZE),
                        random.nextInt(FIGURE_ELEMENT_MAX_SIZE));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_ELEMENT_MAX_SIZE),
                        random.nextInt(FIGURE_ELEMENT_MAX_SIZE));
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_ELEMENT_MAX_SIZE));
            case 4:
                int firstBase = random.nextInt(FIGURE_ELEMENT_MAX_SIZE);
                int secondBase = random.nextInt(FIGURE_ELEMENT_MAX_SIZE);
                int limit = Math.abs(firstBase - secondBase) / 2;
                int leg = random.nextInt(FIGURE_ELEMENT_MAX_SIZE - limit) + limit;
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        firstBase,
                        secondBase,
                        leg);
            default: return null;
        }
    }
}
