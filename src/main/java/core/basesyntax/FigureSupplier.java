package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random rnd = new Random();
    private static final int MAX_VALUE = 20;

    public Figure getRandomFigure() {
        int numFigure = rnd.nextInt(5);
        switch (numFigure) {
            case 0:
                return new Circle(ColorSupplier.getRandomColor(),
                        getRandomDimension());
            case 1:
                return new Rectangle(ColorSupplier.getRandomColor(),
                        getRandomDimension(), getRandomDimension());
            case 2:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        getRandomDimension(), getRandomDimension(), getRandomDimension());
            case 3:
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        getRandomDimension(), getRandomDimension());
            case 4:
                return new Square(ColorSupplier.getRandomColor(),
                        getRandomDimension());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }

    private int getRandomDimension() {
        return 1 + rnd.nextInt(MAX_VALUE - 1);
    }
}
