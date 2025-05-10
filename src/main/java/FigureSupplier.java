import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int FIGURES_QUANTITY = 4;
    private static final int RANDOM_BOUND = 100;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURES_QUANTITY);
        switch (randomFigure) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomSquare();
            default:
                return getRandomRightTriangle();
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR, RADIUS);
    }

    private Figure getRandomCircle() {
        return new Circle(supplier.getRandomColor(), random.nextDouble(RANDOM_BOUND));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(supplier.getRandomColor(),
                random.nextDouble(RANDOM_BOUND),
                random.nextDouble(RANDOM_BOUND),
                random.nextDouble(RANDOM_BOUND));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(supplier.getRandomColor(),
                random.nextDouble(RANDOM_BOUND),
                random.nextDouble(RANDOM_BOUND));
    }

    private Figure getRandomSquare() {
        return new Square(random.nextDouble(RANDOM_BOUND),
                supplier.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(supplier.getRandomColor(),
                random.nextDouble(RANDOM_BOUND),
                random.nextDouble(RANDOM_BOUND));
    }
}
