package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIZE = 100;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figure = random.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();
        int size = random.nextInt(MAX_SIZE);

        switch (figure) {
            case 0:
                return new Square(randomColor, size);
            case 1:
                return new Circle(randomColor, size);
            case 2:
                return new Rectangle(randomColor, size, size);
            case 3:
                return new RightTriangle(randomColor, size, size);
            case 4:
                return new IsoscelesTrapezoid(randomColor, size, size, size);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
