package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_FIGURES = 5;
    public static final int MAX_PROPERTIES = 10;
    public static final int DEFAULT_RADIUS = 10;
    public static final Color DEFAULT_COLOR = Color.WHITE;

    private Random rand = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color color = supplier.getRandomColor();
        int figuretype = rand.nextInt(MAX_FIGURES);

        switch (figuretype) {
            case 0:
                return new Square(rand.nextInt(MAX_PROPERTIES), color);
            case 1:
                return new Circle(rand.nextInt(MAX_PROPERTIES), color);
            case 2:
                return new Rectangle(rand.nextInt(MAX_PROPERTIES),
                        rand.nextInt(MAX_PROPERTIES), color);
            case 3:
                return new RightTriangle(rand.nextInt(MAX_PROPERTIES),
                        rand.nextInt(MAX_PROPERTIES), color);
            case 4:
                return new IsoscelesTrapezoid(rand.nextInt(MAX_PROPERTIES),
                        rand.nextInt(MAX_PROPERTIES), rand.nextInt(MAX_PROPERTIES), color);
            default:
                return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
