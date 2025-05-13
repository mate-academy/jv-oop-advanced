package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();

        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                double radius = random.nextInt(10) + 1;
                return new Circle(color, radius);

            case 1:
                double side = random.nextInt(10) + 1;
                return new Square(color, side);

            case 2:
                int width = random.nextInt(10) + 1;
                int height = random.nextInt(10) + 1;
                return new Rectangle(color, width, height);

            case 3:
                int firstLeg = random.nextInt(10) + 1;
                int secondLeg = random.nextInt(10) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);

            case 4:
                int base1 = random.nextInt(10) + 1;
                int base2 = random.nextInt(10) + 1;
                int trapezoidHeight = random.nextInt(10) + 1;
                return new IsoscelesTrapezoid(color, base1, base2, trapezoidHeight);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
