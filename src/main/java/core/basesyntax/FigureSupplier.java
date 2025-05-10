package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final int MAGIC_NUMBER = 47;
    private final Random random = new Random(MAGIC_NUMBER);
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Figure[] figures = new Figure[]{new Circle(Color.valueOf(
        colorSupplier.getRandomColor()), random.nextDouble()),
        new IsoscelesTrapezoid(Color.valueOf(colorSupplier.getRandomColor()),
            random.nextDouble(), random.nextDouble(), random.nextDouble()),
        new Rectangle(Color.valueOf(colorSupplier.getRandomColor()),
            random.nextDouble(), random.nextDouble()),
        new Square(Color.valueOf(colorSupplier.getRandomColor()), random.nextDouble())};

    public Figure getRandomFigure() {
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Square(Color.WHITE, 10d);
    }
}
