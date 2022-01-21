package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colSup = new ColorSupplier();

    public Figure getRandomFigure() {
        int var = new Random().nextInt(4);
        switch (var) {
            case 0:
                return new Circle(new Random().nextInt(20) + 1, colSup.getRandomColor());
            case 1:
                return new Square(new Random().nextInt(20) + 1, colSup.getRandomColor());
            case 2:
                return new Triangle(new Random().nextInt(20) + 1, new Random().nextInt(20) + 1,
                        colSup.getRandomColor());
            case 3:
                return new Rectangle(new Random().nextInt(20) + 1, new Random().nextInt(20) + 1,
                        colSup.getRandomColor());
            default:
                return new Trapezoid(new Random().nextInt(20) + 1, new Random().nextInt(20) + 1,
                        new Random().nextInt(20 + 1), colSup.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        final int Radius = 10;
        return new Circle(Radius,"white");
    }
}
