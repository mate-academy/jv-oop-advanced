package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_SIZE = 10;
    public static final int MAX_SIZE = 50;
    public static final Random random = new Random();

    public Figure getRandomFigure() {
        FigureType ft = FigureType.values()
                [random.nextInt(FigureType.values().length)];
        int a = random.nextInt(MAX_SIZE) + 1;
        int b = random.nextInt(MAX_SIZE) + 1;
        int c = random.nextInt(MAX_SIZE) + 1;
        ColorSupplier cs = new ColorSupplier();

        return switch (ft) {
            case CIRCLE -> new Circle(cs.getRandomColor(), a);
            case SQUARE -> new Square(cs.getRandomColor(), a);
            case RECTANGLE -> new Rectangle(cs.getRandomColor(), a, b);
            case TRIANGLE -> new RightTriangle(cs.getRandomColor(), a, b);
            case TRAPEZOID -> new IsoscelesTrapezoid(cs.getRandomColor(), a, b, c);
            default -> getDefaultFigure();
        };

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_SIZE);
    }
}
