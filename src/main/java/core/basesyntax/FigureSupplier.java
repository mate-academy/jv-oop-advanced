package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final double DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = new ColorSupplier().getDefaultColor();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT + 1);
        String color = colorSupplier.getRandomColor();
        switch (figureNumber) {
            case 1:
                double radius = random.nextInt(100);
                return new Circle(radius, color);
            case 2:
                double diagonal = random.nextInt(100);
                double topLeg = random.nextInt(100);
                double bottomLeg = random.nextInt(100);
                return new IsoscelesTrapezoid(diagonal, topLeg, bottomLeg, color);
            case 3:
                double side = random.nextInt(100);
                return new Square(side, color);
            case 4:
                double firstLeg = random.nextInt(100);
                double secondLeg = random.nextInt(100);
                return new RightTriangle(firstLeg, secondLeg, color);
            default:
                firstLeg = random.nextInt(100);
                secondLeg = random.nextInt(100);
                return new Rectangle(firstLeg, secondLeg, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
