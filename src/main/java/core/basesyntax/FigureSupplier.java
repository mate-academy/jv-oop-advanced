package core.basesyntax;
import java.util.Random;
public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIZE = 100;
    private static final int MIN_SIZE = 1;

    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10.0;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        double size1 = random.nextInt(MAX_SIZE) + MIN_SIZE;
        double size2 = random.nextInt(MAX_SIZE) + MIN_SIZE;
        double size3 = random.nextInt(MAX_SIZE) + MIN_SIZE;

        switch (figureType) {
            case 0:
                return new Circle(color, size1);
            case 1:
                return new Square(color, size1);
            case 2:
                return new Rectangle(color, size1, size2);
            case 3:
                return new RightTriangle(color, size1, size2);
            case 4:
            default:
                return new IsoscelesTrapezoid(color, size1, size2, size3);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
