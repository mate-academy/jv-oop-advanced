package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10.0;

    private final Random random = new Random();
    private final ColorSupplier cs = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = cs.getRandomColor();
        Figure[] figures = {
                new Circle(color, random.nextInt(NUMBER)),
                new Square(color, random.nextInt(NUMBER)),
                new IsoscelesTrapezoid(color, random.nextInt(NUMBER),
                        random.nextInt(NUMBER), random.nextInt(NUMBER)),
                new RightTriangle(color, random.nextInt(NUMBER), random.nextInt(NUMBER)),
                new Rectangle(color, random.nextInt(NUMBER), random.nextInt(NUMBER))
        };
        return figures[random.nextInt(figures.length)];

    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
