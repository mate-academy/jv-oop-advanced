package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private final AbstractFigure[] figures = new AbstractFigure[]{
            new Square(colorSupplier.getRandomColor(),
                    10 * random.nextDouble()),
            new RightTriangle(colorSupplier.getRandomColor(),
                    10 * random.nextDouble(), 10 * random.nextDouble()),
            new Rectangle(colorSupplier.getRandomColor(),
                    10 * random.nextDouble(), 10 * random.nextDouble()),
            new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    10 * random.nextDouble(), 10 * random.nextDouble()),
            new Circle(colorSupplier.getRandomColor(),
                    10 * random.nextDouble())
    };

    public Circle getDefaultFigure() {
        final double defaultRadius = 10.0;
        final String defaultColor = "white";
        return new Circle(defaultColor, defaultRadius);
    }

    public AbstractFigure getRandomFigure() {
        int index = random.nextInt(5);
        return figures[index];
    }
}
