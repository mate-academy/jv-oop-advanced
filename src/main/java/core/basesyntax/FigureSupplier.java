package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_BOUND = 100;
    public static final String COLOR_DEFAULT = "WHITE";
    public static final double DEFAULT_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return getRandomCircle();
            case 1 :
                return getRandomTrapezoid();
            case 2 :
                return getRandomRectangle();
            case 3 :
                return getRandomTriangle();
            default:
                return getRandomSquare();
        }
    }
    
    public Figure getDefaultFigure() {
        return new Circle(COLOR_DEFAULT, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_BOUND));
    }

    private Figure getRandomTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_BOUND),
                random.nextInt(MAX_BOUND), random.nextInt(MAX_BOUND));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_BOUND),
                random.nextInt(MAX_BOUND));
    }

    private Figure getRandomTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_BOUND));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_BOUND));
    }
}
