package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public final Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return new Square(12, "PINK");
        }
    }

    public final Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }

    private double getRandomHeight() {
        return random.nextDouble() * 10 + 1;
    }

    private double getRandomRadius() {
        return random.nextDouble() * 10 + 1;
    }

    private double getRandomSide() {
        return random.nextDouble() * 10 + 1;
    }

    private double getRandomBase() {
        return random.nextDouble() * 10 + 1;
    }

    private double getRandomCat() {
        return random.nextDouble() * 10 + 1;
    }

    private Circle getRandomCircle() {
        return new Circle(getRandomRadius(), colorSupplier.getRandomColor());
    }

    private Square getRandomSquare() {
        return new Square(getRandomSide(), colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomBase(), getRandomBase(),
                getRandomHeight(), colorSupplier.getRandomColor());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(getRandomSide(), getRandomSide(), colorSupplier.getRandomColor());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(getRandomCat(), getRandomCat(), colorSupplier.getRandomColor());
    }
}
