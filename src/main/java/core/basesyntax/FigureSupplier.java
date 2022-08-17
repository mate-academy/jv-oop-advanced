package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int VALUE = 50;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandomValue() {
        return random.nextInt(VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_NUMBER);
        switch (index) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomValue());
            case 2:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomValue());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomValue(),getRandomValue());
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomValue(),getRandomValue(), getRandomValue());
        }
    }
}
