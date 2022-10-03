package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE_PARAMETR = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Circle circle = new Circle("white",10);

    public Figures getRandomFigure() {
        int index = random.nextInt(Figures.values().length);
        return Figures.values()[index];
    }

    public Figure getRandomResult() {
        switch (getRandomFigure()) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_PARAMETR));
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_PARAMETR));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_PARAMETR), random.nextInt(MAX_VALUE_PARAMETR));
            case RIGHTTRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_PARAMETR), random.nextInt(MAX_VALUE_PARAMETR));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_PARAMETR), random.nextInt(MAX_VALUE_PARAMETR),
                        random.nextInt(MAX_VALUE_PARAMETR));
        }
    }

    public Circle getDefaultFigure() {
        return circle;
    }
}
