package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        Figure[] figures = {new Square(colorSupplier.getRandomColor(),
                random.nextDouble()), new Rectangle(colorSupplier.getRandomColor(),
                random.nextDouble(), random.nextDouble()),
                new RightTriangle(random.nextDouble(),
                        random.nextDouble(), colorSupplier.getRandomColor()),
                new Circle(random.nextDouble(),
                        colorSupplier.getRandomColor()),
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(), random.nextDouble(), random.nextDouble())};
        int index = random.nextInt(figures.length);
        return figures[index];
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");

    }
}
