package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        int index = Figures.values().length;
        Figures fig = Figures.values()[new Random().nextInt(index)];
        switch (fig) {
            case SQUARE:
                return new Square(new ColorSupplier().getRandomColor(),
                        (double)Math.round(new Random().nextDouble() * 10000) / 100);
            case RECTANGLE:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        (double)Math.round(new Random().nextDouble() * 10000) / 100,
                        (double)Math.round(new Random().nextDouble() * 10000) / 100);
            case RIGHT_TRIANGLE:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        (double)Math.round(new Random().nextDouble() * 10000) / 100);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        (double)Math.round(new Random().nextDouble() * 10000) / 100,
                        (double) Math.round(new Random().nextDouble() * 10000) / 100,
                        (double) Math.round(new Random().nextDouble() * 10000) / 100);
            case CIRCLE:
                return new Circle(new ColorSupplier().getRandomColor(),
                        (double) Math.round(new Random().nextDouble() * 10000) / 100);
            default:
                System.out.println("Something goes wrong: FigureSupplier().getRandomFigure()");
                return new Circle(Colors.values()[0].toString(), 10.00);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.values()[0].toString(), 10.0);
    }
}

