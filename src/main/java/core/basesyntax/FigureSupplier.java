package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 15;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;

    private final Random randomizer = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int getRandomInt = randomizer.nextInt(BOUND);
        int getRandomInt2 = randomizer.nextInt(BOUND);
        int getRandomInt3 = randomizer.nextInt(BOUND);

        switch (randomizer.nextInt(Figures.values().length)) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt);
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomInt, getRandomInt2, getRandomInt3);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomInt, getRandomInt2);
            case 4:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomInt, getRandomInt2);
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomInt);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
