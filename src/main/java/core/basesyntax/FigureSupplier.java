package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private static final int SIZE_LIMIT = 99;
    private static final String COLOR_OF_CIRCLE = Color.WHITE.name();
    private static final int RADIUS_OF_CIRCLE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumberToChooseFigure = random.nextInt(NUMBER_OF_FIGURE_TYPES);
        int firstRandomNumberToSetSizes = random.nextInt(SIZE_LIMIT) + 1;
        int secondRandomNumberToSetSizes = random.nextInt(SIZE_LIMIT) + 1;
        String randomColor = colorSupplier.getRandomColor();

        switch (randomNumberToChooseFigure) {
            case 0:
                return new Circle(randomColor, firstRandomNumberToSetSizes);
            case 1:
                return new IsoscelesTrapezoid(randomColor, firstRandomNumberToSetSizes,
                        secondRandomNumberToSetSizes);
            case 2:
                return new Rectangle(randomColor, firstRandomNumberToSetSizes,
                        secondRandomNumberToSetSizes);
            case 3:
                return new RightTriangle(randomColor, firstRandomNumberToSetSizes,
                        secondRandomNumberToSetSizes);
            case 4:
                return new Square(randomColor, firstRandomNumberToSetSizes);
            default:
                return new Circle(COLOR_OF_CIRCLE, RADIUS_OF_CIRCLE);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_OF_CIRCLE, RADIUS_OF_CIRCLE);
    }
}
