package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private String randomColor = colorSupplier.getRandomColor();
    private Figure[] figures = {new Circle(randomColor, random.nextDouble()),
            new Square(randomColor, random.nextDouble()),
            new Rectangle(randomColor, random.nextDouble(),random.nextDouble()),
            new RightTriangle(randomColor,
                    random.nextDouble(),random.nextDouble()),
            new IsoscelesTrapezoid(randomColor, random.nextDouble(),
                    random.nextDouble(),random.nextDouble())};

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString(),10);
    }

    public Figure getRandomFigure() {
        return figures[random.nextInt(figures.length)];
    }

}
