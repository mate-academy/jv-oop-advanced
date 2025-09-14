package core.basesyntax;
import java.util.Random;
public class FigureSupplier {
    private static final int FIGURE_TYPE_COUNT = 5;
    private static final int MAX_RANDOM_DIMENSION = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_TYPE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (type) {
            case 0: {
                int side = random.nextInt(MAX_RANDOM_DIMENSION) + 1;
                return new Square(side, color);
            }
            case 1: {
                int width = random.nextInt(MAX_RANDOM_DIMENSION) + 1;
                int height = random.nextInt(MAX_RANDOM_DIMENSION) + 1;
                return new Rectangle(width, height, color);
            }
            case 2: {
                int firstLeg = random.nextInt(MAX_RANDOM_DIMENSION) + 1;
                int secondLeg = random.nextInt(MAX_RANDOM_DIMENSION) + 1;
                return new RightTriangle(firstLeg, secondLeg, color);
            }
            case 3: {
                int radius = random.nextInt(MAX_RANDOM_DIMENSION) + 1;
                return new Circle(radius, color);
            }
            default: {
                int base1 = random.nextInt(MAX_RANDOM_DIMENSION) + 1;
                int base2 = random.nextInt(MAX_RANDOM_DIMENSION) + 1;
                int height = random.nextInt(MAX_RANDOM_DIMENSION) + 1;
                return new IsoscelesTrapezoid(base1, base2, height, color);
            }
        }
    }
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
