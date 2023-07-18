package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier;
    private Random random = new Random();
    private final int maxSide = 10;
    private final int minSide = 1;
    private final String defaultColor = "WHITE";

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),random.nextInt(maxSide) + minSide);
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(maxSide) + 1, random.nextInt(maxSide) + minSide);
    }

    private RightTriangle getRandomrightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(maxSide) + 1, random.nextInt(maxSide) + minSide);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(maxSide) + minSide);
    }

    private IsoscelesTrapezoid getRandomisoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(maxSide) + minSide, random.nextInt(maxSide)
                + minSide, random.nextInt(maxSide) + minSide);
    }

    public AreaCalculator getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(5);
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

    public AreaCalculator getDefaultFigure() {
        return new Circle(defaultColor, maxSide);
    }
}
