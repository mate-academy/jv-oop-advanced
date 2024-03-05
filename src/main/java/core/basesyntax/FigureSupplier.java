package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure[] figures = {
                new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        random.nextInt(1000),
                        random.nextInt(1000),
                        random.nextInt(1000)
                ),
                new Circle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(1000)
                ),
                new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(1000),
                        random.nextInt(1000)
                ),
                new Rectangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(1000),
                        random.nextInt(1000)
                ),
                new Square(
                        colorSupplier.getRandomColor(),
                        random.nextInt(1000)
                )};
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString(), 10);
    }
}
