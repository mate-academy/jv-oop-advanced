package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_OF_FIGURES = 5;
    private static final int MAXIMUM = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(COUNT_OF_FIGURES);

        String color = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                int side = random.nextInt(MAXIMUM);
                return new Square(color, side);
            case 1:
                int firstSide = random.nextInt(MAXIMUM);
                int secondSide = random.nextInt(MAXIMUM);
                return new Rectangle(color, firstSide, secondSide);
            case 2:
                int firstLeg = random.nextInt(MAXIMUM);
                int secondLeg = random.nextInt(MAXIMUM);
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                int radius = random.nextInt(MAXIMUM);
                return new Circle(color, radius);
            case 4:
                int firstBase = random.nextInt(MAXIMUM);
                int secondBase = random.nextInt(MAXIMUM);
                int height = random.nextInt(MAXIMUM);
                return new IsoscelesTrapezoid(color, firstBase, secondBase, height);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
