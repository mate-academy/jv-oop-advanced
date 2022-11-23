package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_UNIT = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figure = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figure) {
            case 0:
                int radius = random.nextInt(MAX_UNIT) + 1;
                return new Circle(color, radius);
            case 1:
                int longBase = random.nextInt(MAX_UNIT) + 1;
                int shortBase = random.nextInt(longBase - 1) + 1;
                int height = random.nextInt(MAX_UNIT) + 1;
                return new IsoscelesTrapezoid(color, shortBase, longBase, height);
            case 2:
                int length = random.nextInt(MAX_UNIT) + 1;
                int width = random.nextInt(length - 1) + 1;
                return new Rectangle(color, length, width);
            case 3:
                int firstLeg = random.nextInt(MAX_UNIT) + 1;
                int secondLeg = random.nextInt(MAX_UNIT) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);
            default:
                int side = random.nextInt(MAX_UNIT) + 1;
                return new Square(color,side);
        }
    }

    public Figure getDefaultFigure() {
        String color = Color.WHITE.name();
        int radius = 10;
        return new Circle(color, radius);
    }
}
