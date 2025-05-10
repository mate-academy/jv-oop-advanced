package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int FIGURES_AMOUNT = 5;
    private static final int UNITS_BORDER = 20;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURES_AMOUNT);
        switch (randomFigure) {
            case 0:
                int side = random.nextInt(UNITS_BORDER) + 1;
                return new Square(colorSupplier.getRandomColor(), side);
            case 1:
                double leftSide = random.nextInt(UNITS_BORDER) + 1;
                double downSide = random.nextInt(UNITS_BORDER) + 1;
                return new Rectangle(colorSupplier.getRandomColor(), leftSide, downSide);
            case 2:
                double firstLeg = random.nextInt(UNITS_BORDER) + 1;
                double secondLeg = random.nextInt(UNITS_BORDER) + 1;
                return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
            case 3:
                double radius = random.nextInt(UNITS_BORDER) + 1;
                return new Circle(colorSupplier.getRandomColor(), radius);
            case 4:
                /* upper base cant be the same as bottom base */
                double upperBase = random.nextInt(UNITS_BORDER - 1) + 1;
                double bottomBase = random.nextInt(UNITS_BORDER) + 1;
                double lateralSide = random.nextInt(UNITS_BORDER) + 1;
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                                              upperBase, bottomBase, lateralSide);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
