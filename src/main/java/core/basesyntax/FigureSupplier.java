package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final int FIGURE_TYPES = 5;
    private static final double MAX_SIZE = 100;

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        int type = RANDOM.nextInt(FIGURE_TYPES);

        switch (type) {
            case 0:
                double side = RANDOM.nextDouble(MAX_SIZE) + 1;
                return new Square(color, side);

            case 1:
                double width = RANDOM.nextDouble(MAX_SIZE) + 1;
                double length = RANDOM.nextDouble(MAX_SIZE) + 1;
                return new Rectangle(color, width, length);

            case 2:
                double radius = RANDOM.nextDouble(MAX_SIZE) + 1;
                return new Circle(color, radius);

            case 3:
                double firstLeg = RANDOM.nextDouble(MAX_SIZE) + 1;
                double secondLeg = RANDOM.nextDouble(MAX_SIZE) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);

            case 4:
                double base1 = RANDOM.nextDouble(MAX_SIZE) + 1;
                double base2 = RANDOM.nextDouble(MAX_SIZE) + 1;
                double height = RANDOM.nextDouble(MAX_SIZE) + 1;
                return new IsoscelesTrapezoid(color, base1, base2, height);

            default:
                throw new RuntimeException("Unexpected figure type");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
