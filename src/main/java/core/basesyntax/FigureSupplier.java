package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_INDEX = 5;
    private static final int MAX_UNITS = 100;
    private static final Random random = new Random();
    private static final String DEFAULT_COLOR = Color.values()[0].name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(MAX_INDEX);
        switch (randomIndex) {
            case 0:
                return new Square("square",
                                  new ColorSupplier().getRandomColor(),
                                  random.nextInt(MAX_UNITS));
            case 1:
                return new Rectangle("rectangle",
                                     new ColorSupplier().getRandomColor(),
                                     random.nextInt(MAX_UNITS), random.nextInt(MAX_UNITS));
            case 2:
                return new Circle("circle",
                                  new ColorSupplier().getRandomColor(),
                                  random.nextInt(MAX_UNITS));
            case 3:
                return new RightTriangle("right triangle",
                                         new ColorSupplier().getRandomColor(),
                                         random.nextInt(MAX_UNITS), random.nextInt(MAX_UNITS));
            default:
                return new IsoscelesTrapezoid("isosceles trapezoid",
                                              new ColorSupplier().getRandomColor(),
                                              random.nextInt(MAX_UNITS), random.nextInt(MAX_UNITS),
                                              random.nextInt(MAX_UNITS), random.nextInt(MAX_UNITS));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("circle", DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
