package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_INDEX_FOR_FIGURE = 5;
    private static final int MAX_INDEX_FOR_PARAM = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier co = new ColorSupplier();

    private int raIndex() {
        return random.nextInt(MAX_INDEX_FOR_PARAM) + 1;
    }

    public Figure getRandomFigure() {
        int randIndexForFigure = random.nextInt(MAX_INDEX_FOR_FIGURE);
        switch (randIndexForFigure) {
            case 0:
                return new Circle(raIndex(), co.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(raIndex(), raIndex(), raIndex(), co.getRandomColor());
            case 2:
                return new Rectangle(raIndex(), raIndex(), co.getRandomColor());
            case 3:
                return new RightTriangle(raIndex(), raIndex(), co.getRandomColor());
            case 4:
                return new Square(raIndex(), co.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
