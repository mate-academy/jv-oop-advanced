package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Colors c = Colors.values()[random.nextInt(Colors.values().length)];
        double number = random.nextDouble(10) + 1;
        Figure[] figures = new Figure[]{
                new Circle(number, c),
                new IsoscelesTrapezoid(number, number, number, c),
                new Square(number, c),
                new Rectangle(number, number, c),
                new RightTriangle(number, number, c)
        };
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE);
    }
}

