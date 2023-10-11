package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER_SWITCH = 5;
    private static final int MAX_SIDE_FIGURE = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Drawable getRandomFigure() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomSide = random.nextInt(MAX_SIDE_FIGURE) + 1;

        switch (random.nextInt(MAX_NUMBER_SWITCH)) {
            case 0:
                return new Square(randomSide, randomColor);
            case 1:
                return new Rectangle(randomSide, randomSide, randomColor);
            case 2:
                return new RightTriangle(randomSide, randomSide, randomColor);
            case 3:
                return new Circle(randomSide, randomColor);
            case 4:
                return new IsoscelesTrapezoid(randomSide, randomSide, randomSide, randomColor);
            default:
                throw new IllegalStateException("Invalid figure type generated.");
        }
    }

    public Drawable getDefaultFigure() {
        Color color = Color.WHITE;
        return new Circle(10, color);
    }

}
