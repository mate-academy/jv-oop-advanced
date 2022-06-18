package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        int index = Figures.values().length;
        Figures fig = Figures.values()[new Random().nextInt(index)];
        switch (fig) {
            case SQUARE:
                return new Square(new ColorSupplier().getRandomColor(), new Random().nextDouble());
            case RECTANGLE:
                return new Rectangle(new ColorSupplier().getRandomColor(), new Random().nextDouble(), new Random().nextDouble());
            case RIGHT_TRIANGLE:
                return new RightTriangle(new ColorSupplier().getRandomColor(), new Random().nextDouble());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(), new Random().nextDouble(),
                                              new Random().nextDouble(), new Random().nextDouble());
            case CIRCLE:
                return new Circle(new ColorSupplier().getRandomColor(), new Random().nextDouble());
            default:
                System.out.println("Something goes wrong: FigureSupplier().getRandomFigure()");
                return new Circle(Colors.values()[0].toString(), 10.0 );
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.values()[0].toString(), 10.0);
    }
}
