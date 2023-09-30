package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final String WHITE_COLOR = String.valueOf(Colors.WHITE);
    private static final int CIRCLE_DEFAULT_RADIUS = 10;

    private static final int MAX_FIGURE_VALUES = 100;
    private Random random = new Random();

    public Figure getRandomFigure() {
        String collor = new ColorSupplier().getRandomColor();
        int figureNumber = random.nextInt(FIGURE_NUMBER);
        switch (figureNumber) {
            case 0:
                return new Circle(collor, random.nextInt(MAX_FIGURE_VALUES));
            case 1:
                return new IsoscelesTrapezoid(collor,
                        random.nextInt(MAX_FIGURE_VALUES),
                        random.nextInt(MAX_FIGURE_VALUES),
                        random.nextInt(MAX_FIGURE_VALUES));
            case 2:
                return new Rectangle(collor,
                        random.nextInt(MAX_FIGURE_VALUES),
                        random.nextInt(MAX_FIGURE_VALUES));
            case 3:
                return new RightTriangle(collor,
                        random.nextInt(MAX_FIGURE_VALUES),
                        random.nextInt(MAX_FIGURE_VALUES));
            case 4:
                return new Square(collor,
                        random.nextInt(MAX_FIGURE_VALUES));
            default:
                return new Circle(WHITE_COLOR, CIRCLE_DEFAULT_RADIUS);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE_COLOR, CIRCLE_DEFAULT_RADIUS);
    }
}
