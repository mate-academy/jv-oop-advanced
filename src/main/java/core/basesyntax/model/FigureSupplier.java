package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        Shape[] shapes = Shape.values();
        String shape = shapes[random.nextInt(shapes.length)].name();

        switch (shape) {
            case ("CIRCLE"):
                return new Circle(randomColor.getRandomColor(), random.nextInt(MAX_VALUE));
            case ("SQUARE"):
                return new Square(randomColor.getRandomColor(),
                        random.nextInt(MAX_VALUE));
            case ("RECTANGLE"):
                return new Rectangle(randomColor.getRandomColor(),
                        random.nextInt(), random.nextInt(MAX_VALUE));
            case ("RIGHT_TRIANGLE"):
                return new RightTriangle(randomColor.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            default:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
