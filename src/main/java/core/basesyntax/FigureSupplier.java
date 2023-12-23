package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_VALUES = 10;
    public static final String DEFAULT_COLOR = "white";
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private int randomValues() {
        return random.nextInt(MAX_VALUES) + 1;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT) + 1;
        switch (figureNumber) {
            case 1:
                return new Square(colorSupplier.getRandomColor(), randomValues());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        randomValues(), randomValues());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomValues(), randomValues());
            case 4:
                return new Circle(colorSupplier.getRandomColor(), randomValues());
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomValues(), randomValues(), randomValues());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, MAX_VALUES);
    }
}
