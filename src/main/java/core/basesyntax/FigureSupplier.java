package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                return new Circle("Circle", colorSupplier.getRandomColor(),
                        getRandomDoubleValue());
            case 1:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid",
                        colorSupplier.getRandomColor(), getRandomDoubleValue(),
                        getRandomDoubleValue(), getRandomDoubleValue());
            case 2:
                return new Rectangle("Rectangle", colorSupplier.getRandomColor(),
                        getRandomDoubleValue(), getRandomDoubleValue());
            case 3:
                double side = getRandomDoubleValue();
                return new RightTriangle("Triangle", colorSupplier.getRandomColor(),
                        side, side);
            case 4:
                return new Square("Square", colorSupplier.getRandomColor(),
                        getRandomDoubleValue());
            default:
                return new Circle("error", "error", 0);
        }
    }

    private double getRandomDoubleValue() {
        double min = 0.0;
        double max = 10.0;
        double result = (Math.random() * ((max - min) + 1)) + min;
        return Math.round(result * 100.0) / 100.0;
    }
}
