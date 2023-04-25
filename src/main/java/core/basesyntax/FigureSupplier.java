package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANGE_OF_RANDOM_NUMBERS = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURES_COUNT = 4;
    private final Random random;
    private final ColorSupplier color;
    private final Circle circle;
    private final Rectangle rectangle;
    private final RightTriangle rightTriangle;
    private final Square square;
    private final IsoscelesTrapezoid isoscelesTrapezoid;

    public FigureSupplier() {
        this.random = new Random();
        this.color = new ColorSupplier();
        this.circle = new Circle(getRandomSize(), color.getRandomColor());
        this.rectangle = new Rectangle(getRandomSize(), getRandomSize(), color.getRandomColor());
        this.rightTriangle = new RightTriangle(getRandomSize(), color.getRandomColor());
        this.square = new Square(getRandomSize(), color.getRandomColor());
        this.isoscelesTrapezoid = new IsoscelesTrapezoid(getRandomSize(), getRandomSize(),
                getRandomSize(), color.getRandomColor());
    }

    public int getRandomSize() {
        return (random.nextInt(RANGE_OF_RANDOM_NUMBERS));
    }

    public Figure getRandomFigure() {
        int value = random.nextInt(FIGURES_COUNT);
        switch (value) {
            case 0:
                return circle;
            case 1:
                return rectangle;
            case 2:
                return rightTriangle;
            case 3:
                return square;
            default:
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }
}
