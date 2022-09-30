package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_NUMBER = 6;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int RANDOM_NUMBER = 12;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(MAX_FIGURE_NUMBER);
        switch (figureNumber) {
            case 1:
                return new Circle(getRandomColor(), getRandomNumber());
            case 2:
                return new Rectangle(getRandomColor(), getRandomNumber(), getRandomNumber());
            case 3:
                return new Square(getRandomColor(), getRandomNumber());
            case 4:
                return new IsoscelesTrapezoid(getRandomColor(),
                        getRandomNumber(), getRandomNumber(), getRandomNumber());
            case 5:
                return new RightTriangle(getRandomColor(), getRandomNumber(), getRandomNumber());
            default:
                return getDefaultFigure();

        }
    }

    private String getRandomColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }

    private int getRandomNumber() {
        return new Random().nextInt(RANDOM_NUMBER) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.values()[0].name(),DEFAULT_CIRCLE_RADIUS);
    }
}
