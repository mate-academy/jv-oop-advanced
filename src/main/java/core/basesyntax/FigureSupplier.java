package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE_FIGURE = 5;
    private static final int MAX_VALUE_PARAMETERS = 10;
    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    private double getRandomParameter() {
        return random.nextInt(MAX_VALUE_PARAMETERS) + 1;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_VALUE_FIGURE)) {
            case 0:
                return getCircle();
            case 1:
                return getSquare();
            case 2:
                return getIsoscelesTrapezoid();
            case 3:
                return getRectangle();
            default:
                return getRightTriangle();
        }
    }

    public Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomParameter());
    }

    public Square getSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomParameter());
    }

    public Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomParameter(),
                getRandomParameter());
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomParameter(),
                getRandomParameter(),
                getRandomParameter());
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomParameter(),
                getRandomParameter());
    }

    public final Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
