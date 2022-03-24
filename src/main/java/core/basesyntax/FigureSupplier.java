package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_VALUE = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        double randomDouble = random.nextDouble() * MAX_VALUE;
        switch (FigureType.values()[index]) {
            case CIRCLE:
                return new Circle(FigureType.CIRCLE,
                        randomDouble,
                        colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(FigureType.RECTANGLE,
                        randomDouble,
                        randomDouble,
                        colorSupplier.getRandomColor());
            case SQUARE:
                return new Square(FigureType.SQUARE,
                        randomDouble,
                        colorSupplier.getRandomColor());
            case TRAPEZOID:
                return new Trapezoid(FigureType.TRAPEZOID,
                        randomDouble,
                        randomDouble,
                        randomDouble,
                        colorSupplier.getRandomColor());
            default:
                return new Triangle(FigureType.TRIANGLE,
                        randomDouble,
                        randomDouble,
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(FigureType.CIRCLE, 10, Color.WHITE);
    }
}
