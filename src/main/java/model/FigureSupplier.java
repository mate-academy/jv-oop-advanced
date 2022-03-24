package model;

import java.util.Random;

public class FigureSupplier {
    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }

    public Figure getRandomFigure() {
        int whichFigure = new Random().nextInt(4);
        switch (whichFigure) {
            case 0: return new Circle(new ColorSupplier().getRandomColor(),
                    new Random().nextDouble(10));
            case 1: return new Rectangle(new ColorSupplier().getRandomColor(),
                    new Random().nextDouble(10), new Random().nextDouble(10));
            case 2: return new RightTriangle(new ColorSupplier().getRandomColor(),
                    new Random().nextDouble(10));
            case 3: return new Square(new ColorSupplier().getRandomColor(),
                    new Random().nextDouble(10));
            case 4: return new Trapezoid(new ColorSupplier().getRandomColor(),
                    new Random().nextDouble(10), new Random().nextDouble(10),
                    new Random().nextDouble(10));
            default: return null;
        }
    }
}
