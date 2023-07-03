package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_SIZE = 20;
    private static final int MIN_SIZE = 1;
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURES_AMOUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_AMOUNT);
        switch (index) {
            case 1:
                return new Circle(colorSupplier.randomColor(),getRandomSize());
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.randomColor(),getRandomSize(),getRandomSize(), getRandomSize());
            case 3:
                return new Square(colorSupplier.randomColor(), getRandomSize());
            case 4:
                return new RightTriangle(colorSupplier.randomColor(),getRandomSize(),getRandomSize());
            default:
                return new Rectangle(colorSupplier.randomColor(), getRandomSize(),getRandomSize());
        }
    }

    public int getRandomSize() {
        return MIN_SIZE + random.nextInt(MAX_SIZE);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
