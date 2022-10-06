package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    public final static int FIGURE_COUNT = 4;

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return getDefaultFigure();

            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());

            case 2:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());

            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomDouble(),
                        getRandomDouble());

            case 4:
            default:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomDouble(),
                        getRandomDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    private int getRandomInt() {
        return new Random().nextInt(100);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }

}
