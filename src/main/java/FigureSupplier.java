import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MAX_RANDOM_SIZE = 5;
    private static final int MIN_RANDOM_SIZE = 1;
    private static final String DEFAULT_COLOR = "White";
    private static final int DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();


    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (index) {
            case 0:
                int radius = random.nextInt(MAX_RANDOM_SIZE) + MIN_RANDOM_SIZE;
                return new Circle(color, radius);
            case 1:
                int side = random.nextInt(MAX_RANDOM_SIZE) + MIN_RANDOM_SIZE;
                return new Square(color, side);

            case 2:
                int width = random.nextInt(MAX_RANDOM_SIZE) + MIN_RANDOM_SIZE;
                int height = random.nextInt(MAX_RANDOM_SIZE) + MIN_RANDOM_SIZE;
                return new Rectangle(color, width, height);

            case 3:
                int firstLeg = random.nextInt(MAX_RANDOM_SIZE) + MIN_RANDOM_SIZE;
                int secondLeg = random.nextInt(MAX_RANDOM_SIZE) + MIN_RANDOM_SIZE;
                return new RightTriangle(color, firstLeg, secondLeg);

            case 4:
                int base1 = random.nextInt(MAX_RANDOM_SIZE) + MIN_RANDOM_SIZE;
                int base2 = random.nextInt(MAX_RANDOM_SIZE) + MIN_RANDOM_SIZE;
                int trapezoidHeight = random.nextInt(MAX_RANDOM_SIZE) + MIN_RANDOM_SIZE;
                return new IsoscelesTrapezoid(color, base1, base2, trapezoidHeight);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
