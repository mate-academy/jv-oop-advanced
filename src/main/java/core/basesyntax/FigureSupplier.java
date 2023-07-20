package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int MAX_SIDE = 10;
    static final int NUM_FOR_FIGURE = 5;
    static final int MIN_SIDE = 1;
    static final String DEFAULT_COLOR = "WHITE";
    private ColorSupplier colorSupplier;
    private Random random = new Random();

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public AreaCalculator getRandomFigure() {
        int index = random.nextInt(NUM_FOR_FIGURE);
        switch (index) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomrightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
                return getRandomisoscelesTrapezoid();
            default:
                throw new IllegalArgumentException("Invalid figure index");
        }
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, MAX_SIDE);
    }
    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),random.nextInt(MAX_SIDE) + MIN_SIDE);
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIDE) + MIN_SIDE, random.nextInt(MAX_SIDE) + MIN_SIDE);
    }

    private RightTriangle getRandomrightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIDE) + MIN_SIDE, random.nextInt(MAX_SIDE) + MIN_SIDE);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIDE) + MIN_SIDE);
    }

    private IsoscelesTrapezoid getRandomisoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIDE) + MIN_SIDE, random.nextInt(MAX_SIDE)
                + MIN_SIDE, random.nextInt(MAX_SIDE) + MIN_SIDE);
    }
}
