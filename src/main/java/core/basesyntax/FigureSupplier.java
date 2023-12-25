package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_VALUES = 10;
    public static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT) + 1;
        switch (figureNumber) {
            case 1:
                return new Square(randomColor(), randomValues());
            case 2:
                return new Rectangle(randomColor(), randomValues(), randomValues());
            case 3:
                return new RightTriangle(randomColor(), randomValues(), randomValues());
            case 4:
                return new Circle(randomColor(), randomValues());
            case 5:
                return new IsoscelesTrapezoid(randomColor(),
                        randomValues(), randomValues(), randomValues());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, MAX_VALUES);
    }

    private int randomValues() {
        return random.nextInt(MAX_VALUES) + 1;
    }

    private String randomColor() {
        return colorSupplier.getRandomColor();
    }

}
