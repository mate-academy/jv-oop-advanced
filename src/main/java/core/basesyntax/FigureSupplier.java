package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_SIDE = 12;
    private static final int MIN_SIDE = 8;
    private static final int NUMBER_FIGURE = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(NUMBER_FIGURE);
        switch (figureNumber) {
            case 0 :
                return new Square(colorSupplier.getRandomColor(), getRandomSizeFigure());
            case 1 :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomSizeFigure(), getRandomSizeFigure(), getRandomSizeFigure());
            case 2 :
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomSizeFigure(), getRandomSizeFigure());
            case 3 :
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomSizeFigure(), getRandomSizeFigure());
            case 4 :
                return new Circle(colorSupplier.getRandomColor(), getRandomSizeFigure());
            default: getDefaultFigure();
            break;
        }
        return getDefaultFigure();

    }

    private int getRandomSizeFigure() {

        return MIN_SIDE + random.nextInt(MAX_SIDE);
    }

    public Figure getDefaultFigure() {

        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
