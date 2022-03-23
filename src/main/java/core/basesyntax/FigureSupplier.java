package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_VALUE = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        double randomDouble = random.nextDouble() * MAX_VALUE;
        switch (FigureType.values()[index]) {
            case CIRCLE:
                figure = new Circle(FigureType.CIRCLE,
                        randomDouble,
                        colorSupplier.getRandomColor());
                break;
            case RECTANGLE:
                figure = new Rectangle(FigureType.RECTANGLE,
                        randomDouble,
                        randomDouble,
                        colorSupplier.getRandomColor());
                break;
            case SQUARE:
                figure = new Square(FigureType.SQUARE,
                        randomDouble,
                        colorSupplier.getRandomColor());
                break;
            case TRAPEZOID:
                figure = new Trapezoid(FigureType.TRAPEZOID,
                        randomDouble,
                        randomDouble,
                        randomDouble,
                        colorSupplier.getRandomColor());
                break;
            default:
                figure = new Triangle(FigureType.TRIANGLE,
                        randomDouble,
                        randomDouble,
                        colorSupplier.getRandomColor());
                break;

        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(FigureType.CIRCLE, 10, Color.WHITE);
    }
}
