package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int FIGURES_NUMBER = 5;
    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public double randomNumber() {
        return random.nextInt(MAX_RANDOM_NUMBER) + 1;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_NUMBER)) {
            case 0:
                return getCircle();
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getRectangle();
            case 3:
                return getSquare();
            default:
                return getRightTriangle();
        }
    }

    public Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(), randomNumber());
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomNumber(),
                randomNumber(), randomNumber());
    }

    public Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), randomNumber(), randomNumber());
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), randomNumber(), randomNumber());
    }

    public Square getSquare() {
        return new Square(colorSupplier.getRandomColor(), randomNumber());
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
