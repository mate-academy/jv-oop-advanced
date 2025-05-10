package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_FIGURE_SIZE_VALUE = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        int sizeValue1 = random.nextInt(MAX_FIGURE_SIZE_VALUE);
        int sizeValue2 = random.nextInt(MAX_FIGURE_SIZE_VALUE);
        int sizeValue3 = random.nextInt(MAX_FIGURE_SIZE_VALUE);

        switch (figureNumber) {
            case 0:
                return new IsoscelesTrapezoid(randomColor, sizeValue1, sizeValue2, sizeValue3);
            case 1:
                return new Rectangle(randomColor, sizeValue1, sizeValue2);
            case 2:
                return new RightTriangle(randomColor, sizeValue1, sizeValue2);
            case 3:
                return new Square(randomColor, sizeValue1);
            case 4:
                return new Circle(randomColor, sizeValue1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), MAX_FIGURE_SIZE_VALUE);
    }
}
