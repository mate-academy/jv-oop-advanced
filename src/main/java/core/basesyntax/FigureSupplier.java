package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 20;
    private static final int FIGURE_TYPE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0: {
                double side = random.nextInt(MAX_SIZE) + 1;
                return new Square(color, side);
            }
            case 1: {
                double width = random.nextInt(MAX_SIZE) + 1;
                double height = random.nextInt(MAX_SIZE) + 1;
                return new Rectangle(color, width, height);
            }
            case 2: {
                double firstLeg = random.nextInt(MAX_SIZE) + 1;
                double secondLeg = random.nextInt(MAX_SIZE) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);
            }
            case 3: {
                double radius = random.nextInt(MAX_SIZE) + 1;
                return new Circle(color, radius);
            }
            default: {
                double base1 = random.nextInt(MAX_SIZE) + 1;
                double base2 = random.nextInt(MAX_SIZE) + 1;
                double height = random.nextInt(MAX_SIZE) + 1;
                return new IsoscelesTrapezoid(color, base1, base2, height);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
