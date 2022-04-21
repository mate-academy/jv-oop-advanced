package model;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_FIGURES = 5;
    private static final int MAX_VALUE = 10;

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), MAX_VALUE);
    }

    public Figure getRandomFigure() {
        int whichFigure = new Random().nextInt(COUNT_FIGURES);
        switch (whichFigure) {
            case 0: return new Circle(new ColorSupplier().getRandomColor(),
                    new Random().nextDouble(MAX_VALUE));
            case 1: return new Rectangle(new ColorSupplier().getRandomColor(),
                    new Random().nextDouble(MAX_VALUE), new Random().nextDouble(MAX_VALUE));
            case 2: return new RightTriangle(new ColorSupplier().getRandomColor(),
                    new Random().nextDouble(MAX_VALUE));
            case 3: return new Square(new ColorSupplier().getRandomColor(),
                    new Random().nextDouble(MAX_VALUE));
            default: return new Trapezoid(new ColorSupplier().getRandomColor(),
                    new Random().nextDouble(MAX_VALUE), new Random().nextDouble(MAX_VALUE),
                    new Random().nextDouble(MAX_VALUE));
        }
    }
}
