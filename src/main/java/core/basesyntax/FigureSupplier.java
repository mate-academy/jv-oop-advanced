package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static double MAX_SIZE = 10;

    public enum Figures {
        Square,
        Rectangle,
        RightTriangle,
        Circle,
        IsoscelesTrapezoid
    }

    public static Figure getRandomFigure() {

        int figureType = RANDOM.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(Math.round((RANDOM.nextDouble(MAX_SIZE) + 1) * 10.0) / 10.0,
                        ColorSupplier.getRandomColor());
            case 1:
                return new Rectangle(Math.round((RANDOM.nextDouble(MAX_SIZE) + 1) * 10.0) / 10.0,
                        Math.round((RANDOM.nextDouble(MAX_SIZE) + 1) * 10.0) / 10.0,
                        ColorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(Math.round((RANDOM.nextDouble(MAX_SIZE) + 1) * 10.0) / 10.0,
                        Math.round((RANDOM.nextDouble(MAX_SIZE) + 1) * 10.0) / 10.0,
                        ColorSupplier.getRandomColor());
            case 3:
                return new Circle(Math.round((RANDOM.nextDouble(MAX_SIZE) + 1) * 10.0) / 10.0,
                        ColorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(Math.round((RANDOM.nextDouble(MAX_SIZE) + 1) * 10.0) / 10.0,
                        Math.round((RANDOM.nextDouble(MAX_SIZE) + 1) * 10.0) / 10.0,
                        Math.round((RANDOM.nextDouble(MAX_SIZE) + 1) * 10.0) / 10.0,
                        ColorSupplier.getRandomColor());
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
