package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEF_FIGURE_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEF_RADIUS = 10;
    private static final int FIGURE_AMOUNT = 5;
    private static final int MAX_LENGTH = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_AMOUNT);
        String randomColor = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Circle(randomColor, getRandomLength());
            case 1:
                return new Square(randomColor, getRandomLength());
            case 2:
                return new Rectangle(randomColor, getRandomLength(), getRandomLength());
            case 3:
                return new IsoscelesTrapezoid(randomColor, getRandomLength(),
                        getRandomLength(), getRandomLength());
            case 4:
                return new RightTriangle(randomColor, getRandomLength(), getRandomLength());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEF_FIGURE_COLOR, DEF_RADIUS);
    }

    private int getRandomLength() {
        return random.nextInt(MAX_LENGTH) + 1;
    }
}
