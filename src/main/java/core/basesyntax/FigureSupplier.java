package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_PARAM_VALUE = 20;
    private static final int FIGURE_TYPES_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Figure defaultFigure = new Circle("white", 10.0);

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                double radius = random.nextInt(MAX_PARAM_VALUE) + 1;
                return new Circle(color, radius);
            case 1:
                double side = random.nextInt(MAX_PARAM_VALUE) + 1;
                return new Square(color, side);
            case 2:
                double width = random.nextInt(MAX_PARAM_VALUE) + 1;
                double height = random.nextInt(MAX_PARAM_VALUE) + 1;
                return new Rectangle(color, width, height);
            case 3:
                double firstLeg = random.nextInt(MAX_PARAM_VALUE) + 1;
                double secondLeg = random.nextInt(MAX_PARAM_VALUE) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);
            case 4:
            default:
                double topBase = random.nextInt(MAX_PARAM_VALUE) + 1;
                double bottomBase = random.nextInt(MAX_PARAM_VALUE) + 1;
                double heightTrapezoid = random.nextInt(MAX_PARAM_VALUE) + 1;
                return new IsoscelesTrapezoid(color, topBase, bottomBase, heightTrapezoid);
        }
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
