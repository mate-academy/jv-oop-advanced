package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_RANDOM = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }
    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        int side = random.nextInt(MAX_RANDOM);
        int length = random.nextInt(MAX_RANDOM);
        int height = random.nextInt(MAX_RANDOM);
        int upperBase = random.nextInt(MAX_RANDOM);
        int lowerBase = random.nextInt(MAX_RANDOM);
        int firstLeg = random.nextInt(MAX_RANDOM);
        int secondLeg = random.nextInt(MAX_RANDOM);
        int radius = random.nextInt(MAX_RANDOM);
        String color = colorSupplier.getRandomColor();

        switch (index) {
            case 0:
                return new Square(side, color);
            case 1:
                return new Rectangle(length, height, color);
            case 2:
                return new RightTriangle(firstLeg, secondLeg, color);
            case 3:
                return new Circle(radius, color);
            case 4:
                return new IsoscelesTrapezoid(upperBase, lowerBase, height, color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
