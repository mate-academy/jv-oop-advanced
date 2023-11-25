package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final Color DEFAULT_COLOR = Color.WHITE;
    public static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(10));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(10), random.nextInt(10));
            case 2:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(10));
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(10), random.nextInt(10),random.nextInt(10));
            default:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(10), random.nextInt(10));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
