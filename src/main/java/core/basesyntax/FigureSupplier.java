package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Figure[] figures = {
                new Circle(new Random().nextDouble(), ColorSupplier.getRandomColor()),
                new IsoscelesTrapezoid(
                        new Random().nextDouble(),
                        new Random().nextDouble(),
                        new Random().nextDouble(),
                        ColorSupplier.getRandomColor()
                ),
                new Rectangle(
                        new Random().nextDouble(),
                        new Random().nextDouble(),
                        ColorSupplier.getRandomColor()
                ),
                new RightTriangle(
                        new Random().nextDouble(),
                        new Random().nextDouble(),
                        ColorSupplier.getRandomColor()
                ),
                new Square(new Random().nextDouble(), ColorSupplier.getRandomColor())
        };

        return figures[new Random().nextInt(figures.length)];
    }

    public static Figure getDefaultFigure() {
        return new Circle(10, Color.White);
    }
}
