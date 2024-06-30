package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.toString();
    private static final int DEFAULT_NUMBER = 10;
    private static final int FIGURE_BORDER = 5;
    private static final int BORDER = 101;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public int randomSide() {
        return random.nextInt(BORDER);
    }

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(FIGURE_BORDER);
        switch (randomFigureIndex) {
            case 0 :
                return new Circle(colorSupplier.getRandomColor(), randomSide());
            case 1 :
                return new Square(colorSupplier.getRandomColor(), randomSide());
            case 2 :
                return new Rectangle(colorSupplier.getRandomColor(), randomSide(), randomSide());
            case 3 :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomSide(), randomSide(), randomSide());
            case 4 :
                return new RightTriangle(colorSupplier.getRandomColor(), randomSide(),
                        randomSide());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_NUMBER);
    }
}
