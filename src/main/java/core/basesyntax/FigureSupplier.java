package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int UNITS_NUMBER = 6;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(FIGURES_NUMBER);
        switch (randomFigureIndex) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return getIsoscelesTrapezoid();
        }
    }

    public Square getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        double firstRandomNumber = getRandomNumber();
        return new Square(color, firstRandomNumber);
    }

    public Circle getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        double firstRandomNumber = getRandomNumber();
        return new Circle(color, firstRandomNumber);
    }

    public Rectangle getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        double firstRandomNumber = getRandomNumber();
        double secondRandomNumber = getRandomNumber();
        return new Rectangle(color, firstRandomNumber, secondRandomNumber);
    }

    public RightTriangle getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        double firstRandomNumber = getRandomNumber();
        double secondRandomNumber = getRandomNumber();
        return new RightTriangle(color, firstRandomNumber, secondRandomNumber);
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, getRandomNumber(),
                getRandomNumber(), getRandomNumber());
    }

    public double getRandomNumber() {
        return random.nextInt(UNITS_NUMBER) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle("RED", 4);
    }
}
