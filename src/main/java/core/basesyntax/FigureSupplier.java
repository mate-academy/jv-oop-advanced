package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final double NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{
                new Circle(colorSupplier.getRandomColor(), random.nextDouble(NUMBER)),
                new Square(colorSupplier.getRandomColor(), random.nextDouble(NUMBER)),
                new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(NUMBER),
                        random.nextDouble(NUMBER)),
                new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(NUMBER), random.nextDouble(NUMBER)),
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(NUMBER),
                        random.nextDouble(NUMBER),
                        random.nextDouble(NUMBER))};
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        Figure[] figures = new Figure[]{new Circle()};
        return figures[random.nextInt(figures.length)];
    }

}
