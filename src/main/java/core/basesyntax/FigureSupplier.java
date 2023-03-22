package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int MAX_NUMBER_FIGURES = 6;
    public static final int MAX_NUMBER_SIDE = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    public static final String DEFAULT_COLOR = "WHITE";
    public static final int DEFAULT_SIZE = 10;

    public Figure getRandomFigure(String randomColor) {

        int shape = random.nextInt(MAX_NUMBER_FIGURES);
        int sideNew = random.nextInt(MAX_NUMBER_SIDE);
        String color = String.valueOf(colorSupplier.getRandomColor());
        if (shape == 0) {
            return new Square(color, sideNew);
        } else if (shape == 1) {
            return new RightTriangle(color, sideNew, sideNew);
        } else if (shape == 2) {
            return new Rectangle(color, sideNew, sideNew);
        } else if (shape == 3) {
            return new IsoscelesTrapezoid(color, sideNew, sideNew, sideNew);
        } else {
            return new Circle(color, sideNew);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);
    }
}
