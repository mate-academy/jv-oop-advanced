package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MIN_DIMENSION = 1;
    private static final double MAX_DIMENSION = 10;
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    //Circle
    private final double radius = random.nextDouble(MIN_DIMENSION, MAX_DIMENSION);
    //Trapezoid
    private final double firstLegTrapezoid = random.nextDouble(MIN_DIMENSION, MAX_DIMENSION);
    private final double secondLegTrapezoid = random.nextDouble(MIN_DIMENSION, MAX_DIMENSION);
    private final double heightTrapezoid = random.nextDouble(MIN_DIMENSION, MAX_DIMENSION);
    //Square
    private final double side = random.nextDouble(MIN_DIMENSION, MAX_DIMENSION);
    //Triangle
    private final double firstLegTriangle = random.nextDouble(MIN_DIMENSION, MAX_DIMENSION);
    private final double secondLegTriangle = random.nextDouble(MIN_DIMENSION, MAX_DIMENSION);
    //Rectangle
    private final double widthRectangle = random.nextDouble(MIN_DIMENSION, MAX_DIMENSION);
    private final double heightRectangle = random.nextDouble(MIN_DIMENSION, MAX_DIMENSION);

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0 -> {
                return new Circle(colorSupplier.getRandomColor(), radius);
            }
            case 1 -> {
                return new Rectangle(colorSupplier.getRandomColor(),
                        widthRectangle, heightRectangle);
            }
            case 2 -> {
                return new RightTriangle(colorSupplier.getRandomColor(),
                        firstLegTriangle, secondLegTriangle);
            }
            case 3 -> {
                return new Square(colorSupplier.getRandomColor(), side);
            }
            case 4 -> {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        firstLegTrapezoid,
                        secondLegTrapezoid,
                        heightTrapezoid);
            }
            default -> {
                return getDefaultFigure();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

}
