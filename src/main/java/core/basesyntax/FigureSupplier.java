package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_VALUE = 15;
    private static final int CIRCLE_DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomIndexFigure = random.nextInt(FIGURE_COUNT);
        switch (randomIndexFigure) {
            case 0 : return new Circle(randomColor, getRandomValue());
            case 1 : return new IsoscelesTrapezoid(randomColor,
                    getRandomValue(), getRandomValue(), getRandomValue());
            case 2 : return new Rectangle(randomColor, getRandomValue(), getRandomValue());
            case 3 : return new RightTriangle(randomColor,
                    getRandomValue(), getRandomValue());
            case 4 : return new Square(randomColor, getRandomValue());
            default: return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, CIRCLE_DEFAULT_RADIUS);
    }

    private int getRandomValue() {
        return random.nextInt(MAX_RANDOM_VALUE);
    }
}
