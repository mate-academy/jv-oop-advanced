package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_PARAM_VALUE = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Figure defaultFigure = new Circle("white", 10.0);

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Circle(color, random.nextInt(MAX_PARAM_VALUE) + 1);
            case 1:
                return new Square(color, random.nextInt(MAX_PARAM_VALUE) + 1);
            case 2:
                return new Rectangle(color, random.nextInt(MAX_PARAM_VALUE) + 1,
                                     random.nextInt(MAX_PARAM_VALUE) + 1);
            case 3:
                return new RightTriangle(color, random.nextInt(MAX_PARAM_VALUE) + 1,
                                         random.nextInt(MAX_PARAM_VALUE) + 1);
            case 4:
            default:
                return new IsoscelesTrapezoid(color, random.nextInt(MAX_PARAM_VALUE) + 1,
                                              random.nextInt(MAX_PARAM_VALUE) + 1,
                                              random.nextInt(MAX_PARAM_VALUE) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
