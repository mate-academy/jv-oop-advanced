package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }

    public Figure getRandomFigure() {
        Figure[] figures = {
                new IsoscelesTrapezoid(
                        random.nextInt(10),
                        random.nextInt(10),
                        colorSupplier.getRandomColor()
                ),
                new Circle(
                        random.nextInt(10),
                        colorSupplier.getRandomColor()
                ),
                new RightTriangle(
                        random.nextInt(10),
                        random.nextInt(15),
                        colorSupplier.getRandomColor()
                ),
                new Rectangle(
                        random.nextInt(10),
                        random.nextInt(15),
                        colorSupplier.getRandomColor()
                ),
                new Square(
                        random.nextInt(10),
                        colorSupplier.getRandomColor()
                )
        };

        return figures[random.nextInt(figures.length - 1)];
    }
}
