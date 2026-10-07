package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final double MAX_RADIUS = 100;
    private static final double DEFAULT_RADIUS = 10;
    private static final double MAX_SIDE = 100;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String colorStr = colorSupplier.getRandomColor();
        Color color = Color.valueOf(colorStr);
        int typeOfFigure = random.nextInt(FIGURE_TYPES_COUNT);

        switch (typeOfFigure) {
            case 0:
                double radius = random.nextDouble(MAX_RADIUS);
                return new Circle(color, radius);
            case 1:
                double side = random.nextDouble(MAX_SIDE);
                return new Square(color, side);
            case 2:
                double sideATriangle = random.nextDouble(MAX_SIDE);
                double sideBTriangle = random.nextDouble(MAX_SIDE);
                return new RightTriangle(color, sideATriangle, sideBTriangle);
            case 3:
                double sideARectangle = random.nextDouble(MAX_SIDE);
                double sideBRectangle = random.nextDouble(MAX_SIDE);
                return new Rectangle(color, sideARectangle, sideBRectangle);
            case 4:
                double sideATrapezoid = random.nextDouble(MAX_SIDE);
                double sideBTrapezoid = random.nextDouble(MAX_SIDE);
                double height = random.nextDouble(MAX_SIDE);
                return new IsoscelesTrapezoid(color, sideATrapezoid, sideBTrapezoid, height);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.white, DEFAULT_RADIUS);
    }
}
