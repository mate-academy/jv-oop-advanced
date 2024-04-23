package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int FIGURE_PARAMETER = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final String color = colorSupplier.getRandomColor();
        int index = random.nextInt(FIGURE_COUNT);
        int rndFigureParameter = random.nextInt(FIGURE_PARAMETER);
        switch (index) {
            case 0:
                return new Circle(color, rndFigureParameter);

            case 1:
                return new IsoscelesTrapezoid(color,rndFigureParameter,
                        rndFigureParameter,rndFigureParameter);

            case 2:
                return new Rectangle(color,rndFigureParameter,rndFigureParameter);

            case 3:
                return new Square(color,rndFigureParameter);

            case 4:
            default:
                return new RightTriangle(color,rndFigureParameter,rndFigureParameter);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }
}
