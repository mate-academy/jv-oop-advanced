package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_FIGURES = 5;
    private static final double DEFAULT_VALUE = 10;
    private static final String DEFAULT_COLOR = "white";
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private double getRandomSide() {
        Random random1 = new Random();
        return random1.nextDouble() * 10 + 1;
    }

    public Figure getRandomFigure() {
        int choice = random.nextInt(MIN_FIGURES);
        switch (choice) {
            case 0:
                return new Square(getRandomSide(), colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(getRandomSide(),getRandomSide(),
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(getRandomSide(), getRandomSide(),
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(getRandomSide(), colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(getRandomSide(),getRandomSide(),
                        getRandomSide(), colorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_VALUE, DEFAULT_COLOR);
    }
}


