package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_VALUE = 10;
    private static final int FIGURES_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURES_COUNT);
        String randomColor = colorSupplier.getRandomColor();
        double side1 = random.nextDouble(MAX_VALUE);
        double side2 = random.nextDouble(MAX_VALUE);
        double side3 = random.nextDouble(MAX_VALUE);
        switch (randomFigure) {
            case 0:
                return new Circle(randomColor, side1);
            case 1:
                return new Square(randomColor, side1);
            case 2:
                return new RightTriangle(randomColor, side1, side2);
            case 3:
                return new Rectangle(randomColor, side1, side2);
            case 4:
                return new IsoscelesTrapezoid(randomColor, side1, side2, side3);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
