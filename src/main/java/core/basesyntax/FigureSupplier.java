package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final int CONST_RADIUS = 10;
    private Random random = new Random();

    private int getRandomValue() {
        return random.nextInt(FIGURE_COUNT);
    }

    public Figure getRandomFigure() {

        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        Random random = new Random();
        int index = random.nextInt(5);
        switch (index) {
            case 0:
                return new Circle(randomColor, getRandomValue());

            case 1:
                return new IsoscelesTrapezoid(randomColor, getRandomValue(), getRandomValue(),
                        getRandomValue());

            case 2:
                return new Rectangle(randomColor, getRandomValue(), getRandomValue());

            case 3:
                return new RightTriangle(randomColor, getRandomValue(), getRandomValue());

            default:
                return new Square(randomColor, getRandomValue());

        }

    }

    public Figure getDefaultFigure() {
        Figure whiteCircle = new Circle("white", CONST_RADIUS);
        return whiteCircle;
    }
}
