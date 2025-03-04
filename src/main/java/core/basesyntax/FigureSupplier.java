package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private Figure[] figures = {new Circle(colorSupplier.getRandomColor(), random.nextDouble()),
            new Square(colorSupplier.getRandomColor(), random.nextDouble()),
            new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(),random.nextDouble()),
            new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextDouble(),random.nextDouble()),
            new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(),
                    random.nextDouble(),random.nextDouble())};

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString(),10);
    }

    public Figure getRandomFigure() {
        return figures[random.nextInt(figures.length)];
    }

}
